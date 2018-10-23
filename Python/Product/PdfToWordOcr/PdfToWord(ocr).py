#将PDF图片扫描成word(不包含任何格式)

import configparser
from wand.image import Image
from PIL import Image as PI
import pyocr
import pyocr.builders
import io
import configparser

iniFileUrl = 'D:\pdf\PdfToWord.ini'
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

print("开始存储txt！！")      
#with open(save_path, "w") as f: #将识别出来的文字存到本地
with open(save_path, 'a',encoding='utf-8') as f:
    print(final_text)
    f.write(str(final_text))

print("Pdf转换txt完成！！") 

print("请问你是否需要退出？")
global i
i="N"
while(i!="Y"):
    i=input("请输入Y/N:")   

