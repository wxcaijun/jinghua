#将PDF图片扫描成word(不包含任何格式)

import configparser
from wand.image import Image
from PIL import Image as PI
import pyocr
import pyocr.builders
import io
import configparser
import re

iniFileUrl = 'PdfToWord.ini'
conf = configparser.ConfigParser() #生成conf对象
conf.read(iniFileUrl,encoding='utf-8') #读取ini配置文件

pdf_path = conf.get("openpath","opath")
print("打开文档路径：",pdf_path)
save_path = conf.get("savepath","spath")
print("保存文件路径是：",save_path) 

tool=pyocr.get_available_tools()[0]
print(tool.get_available_languages())
lang=tool.get_available_languages()[0]
print(lang)

#建立连个列表，存储图像和最终文本
req_image=[]
final_text=[]

#用wand将pdf转jpeg文件
#image_pdf=Image(filename="d:\\pdf\\S.pdf",resolution=300)
image_pdf=Image(filename=pdf_path,resolution=300)
image_jpeg=image_pdf.convert('jpeg')

#把二进制图像对象加入到req_image中
for img in image_jpeg.sequence:
    img_page = Image(image=img)
    req_image.append(img_page.make_blob('jpeg'))

#在图像对象上运行OCR
for img in req_image:
    txt = tool.image_to_string(
        PI.open(io.BytesIO(img)),
        lang=lang,
        builder=pyocr.builders.TextBuilder()               
    )
    final_text.append(txt)

print("开始存储doc或txt！！")      
#with open(save_path, "w") as f: #将识别出来的文字存到本地
with open(save_path, 'w',encoding='utf-8') as f:
    #print(final_text)
    f.write(str(final_text))

print("Pdf转换doc或txt完成！！") 

#正则表达式匹配
#print("开始读取")
s=str(final_text)       
#print("读取完毕！",s)   
    
#print("开始匹配合同金额！")  
pattmoney=r'人民币【\d+\.?\d*】万元'
#pattmoney=r'^([1-9]\d{0,9}|0)([.]?|(\.\d{1,2})?)$'
m1=re.findall(pattmoney,s)
if m1 is not None:
    print("【合同金额】:",m1)
        
#print("开始匹配合同签订日期！")  
pattdate=r'签订日期:\s*(\d{0,4}|\\n\\n)\s*年 \s*(\d{0,2}|\\n\\n)月(\d{0,2}|\\n\\n)日'   
m2=re.search(pattdate,s)
if m2 is not None:
    print("【合同签订日期】:",m2.group())
        
#print("开始匹配合同方！")  
#pattjia=r'甲方; 上海源沫实业有限公司'    
pattjia=r'甲方;.*?([\u4E00-\u9FA5])+公司\\n法定代表人:.*?([\u4E00-\u9FA5]{1,5})+公司\\n法定代表人:.*?([\u4E00-\u9FA5]{1,5})+公司\\n法定代表人:.*?([\u4E00-\u9FA5]{1,5})'  
m3=re.search(pattjia,s)
if m3 is not None:
    print("【甲方乙方丙方公司以及法人代表】::",m3.group())

print("请问你是否需要退出？")
global i
i="N"
while(i!="Y"):
    i=input("请输入Y/N:")   

