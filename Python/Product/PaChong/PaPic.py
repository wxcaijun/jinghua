#-*- coding:utf-8 -*-
import urllib
import re
import time
import urllib.request
import datetime

#通过url获取网页源码html
def get_Html(url):    
    page=urllib.request.urlopen(url)
    htmlcode=page.read()    
    return htmlcode

#保存到文件
def save_file(html):
    pageFile=open('D:\运维\python运维脚本\爬虫\download\pageCode.txt','wb')
    pageFile.write(html)
    pageFile.close()

#在html中找到匹配的re
def get_Img(html):
    #修改这里的匹配模式，适用于不不同的网页
    #reg = r'src="http://.+?\.jpg"' # +号后面加上?--->非贪婪模式
    reg = r'src="(.+?\.jpg)" width'
    imgre = re.compile(reg)
    html=html.decode('utf-8')#python3
    imglist = imgre.findall(html)
    i=0
    for imgurl in imglist:    
        print(imgurl)
        urllib.request.urlretrieve(imgurl,r'D:\运维\python运维脚本\爬虫\download\%s-%d.jpg'%(time.strftime('%Y%m%d-%H%M%S',time.localtime(time.time())),i)) #下载imgurl的图片并且用当前时间戳
        i+=1        
    print("imgurl数量：",i) 


def __main__():
    print('-'*15+'图片网页抓取'+'-'*15)
    url=input("请输入爬取的URL:")
    
    if url:
        pass
    else:
        print('-'*15+'没有地址输入，正在使用默认地址'+'-'*15)
        url='http://tieba.baidu.com/p/1753935195'
    print('-'*15+'正在获取网页'+'-'*15)
    
    html=get_Html(url)
    print('-'*15+'保存网页内容到本地txt'+'-'*15)
    save_file(html)
    print('-'*15+'正在下载图片'+'-'*15)
    get_Img(html)
    print('-'*15+'下载成功'+'-'*15)
    input('Press Enter to exit!!')
    
if __name__ == '__main__':
    __main__()