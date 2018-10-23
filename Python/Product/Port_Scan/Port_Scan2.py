import socket
import time
from socket import *

servername=input("请输入服务器主机名或IP:")
start_port=int(input("请输入起始端口:"))
end_port=int(input("请输入结束端口:"))

target_ip=gethostbyname(servername)
print("服务器%s 对应的IP是  %s" %(servername,target_ip))
opened_ports=[]


while start_port < end_port: 
    sk = socket(AF_INET,SOCK_STREAM)
    sk.settimeout(10)       
    try:                
        sk.connect((target_ip, start_port))        
        print("Server port %s ok!"  % start_port)        
        opened_ports.append(start_port)
        #sk.close()                
    except Exception as e:
        print("Server port %s not connect!" % start_port)              
    start_port = start_port+1
    sk.close()  

print("服务器打开的端口有:")
for i in opened_ports:
    print(i)