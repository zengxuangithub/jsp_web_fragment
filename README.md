# web 模块化


1  servlet3.0 新增技术支持


2  不在要求所有的web功能都部署在web.xml中


-  ## web模块机构（module.jar文件结构）
    META-INF
            |
          web-fragment.xml  //文件名必须为web-fragment
    src
            |
            xxx.class     //该class 文件的源文件 .java 的包为src
    
    其他资源文件
    
-   ##  web-fragment.xml 配置
```
<web-fragment 
version="3.0"
xmlns="http://java.sun.com/xml/ns/javaee" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation=" http://java.sun.com/xml/ns/javaee
http://java.sun.com/xml/ns/javaee/web-fragment_3_0.xsd" > 

<name>moduleb</name>
  <listener>
  	<listener-class>listeners.ParamterListener</listener-class>
  	
  </listener>
  <ordering>
        <!-- 用配置该Web模块必须位于哪些模块之后加载   before 反之-->
  		<after>
  			<name>modulea</name>
  		</after>
  	
   </ordering>
</web-fragment> 
```


- ##  添加到工程中


添加到工程的WEB-INF 中的lib目录中



  
