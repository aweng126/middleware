#中间件实验

本项目中共包含2个实验，四个小实验。

 1.  rmi调用
 2.  socket调用 
 3.  idlj调用
 4.  corba调用
 
 所有实验目的都是验证哥德巴赫猜想，一个大于2的偶数都可以分解为两个质数之和，用的是暴力的方法进行判断。

 关于corba实验环境的配置我特别写了文章[Eclipse下搭建Corba开发环境](http://www.jianshu.com/p/1fbc600de9cf),可以按照图文步骤进行配置。
 【特别说明】改文章只是说配置环境，最后还有一个小小的关于jar包的问题需要大家自行解决，总是做伸手党对身体不好~

### corba实验启动顺序

1. 先到自己的jdk安装目录的bin目录下执行命令  tnameserv
2. 启动服务器端
3. 启动客户端

### 参考文章

1. [远程方法调用（RMI）原理与示例](https://www.cnblogs.com/wxisme/p/5296441.html)
2. [RMI远程方法调用](http://eksliang.iteye.com/blog/2267510)
3. [ RMI、CORBA、IIOP简单实例－－2. CORBA](http://blog.csdn.net/javamxj/article/details/282664)

大家加油~