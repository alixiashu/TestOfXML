# TestOfXML
编写xml文件，通过映射的方式读取xml文件；模拟其中的url，根据url访问对应的类</br>
## cn.alixia.xml.Book.xml
xml基本测试
## cn.alixia.dtd
### web-app_2_3.dtd
DTD xml约束文件，使用概率较小
### Web.xml
web-app_2_3.dtd测试xml
## cn.alixia.schema
### web-app_2_5.xsd
Schema xml约束文件,常用
### Web.xml
web-app_2_5.xsd测试xml
## dom4j-1.6.1.jar
用于xml的解析
## cn.alixia.xml.dom4j.TestDom4j
使用dom4j解析cn.alixia.schema.Web.xml文件
## cn.alixia.web.servlet
### IMyServlet.java
自定义Servlet接口
### IMyServlet.java
IMyServlet接口MyServletImpl实现类
### TestMyServlet.java
MyServletImpl测试类
## cn.alixia.web.servlet
### IMyServlet.java
自定义Servlet接口
### IMyServlet.java
IMyServlet接口MyServletImpl实现类
## cn.alixia.web.servletReflect
### Web.xml
2个servlet节点和2个servlet-mapping节点（myServletReflect1，myServletReflect2）
### IMyServlet.java
IMyServlet接口MyServletImpl实现类
### MyServletReflect.java
IMyServlet接口MyServletReflect实现类</br>
对应Web.xml里的cn.alixia.web.servletReflect.MyServletReflect
### MyServletReflect2.java
IMyServlet接口MyServletReflect2实现类</br>
cn.alixia.web.servletReflect.MyServletReflect2
### TestMyServlet.java
使用dom4j解析Web.xml文件，读取根节点下的第一个servlet，并根据其class-name创建类实例，并执行函数
### TestMyServlet.java
* 1、使用dom4j解析Web.xml文件，读取根节点下的所有子节点；
* 2、建立url-className的键值对Map
* 3、模拟url；读取map里对应的className,创建类实例，并执行函数


