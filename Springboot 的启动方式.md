# Springboot 的启动方式 #

- 除了 jar或者war的方式，还有目录启动方式
- 
  - 目录启动方式可以解决帮助过期的jar 不支持springboot 信访室，比如老版本的mybatis
  - 如果是jar启动的是jarlauncher，跳转到target包下 运行 java -jar
  - 如果是war包启动的是warlancher， 跳转到target包下 运行 java -jar


## 改为war启动 ##
1. 先直接将pom文件的package 改为war，看看报错
2. 错误如下：
    ```
    Failed to execute goal org.apache.maven.plugins:maven-war-plugin:3.1.0:war (default-war) on project demo1: Error assembling WAR: webxml attribute is required (or pre-existing WEB-INF/web.xml if executing in update mode)
   ```
1.  创建webapp/WEB-INF 目录  
1. 新建一个空的web.xml
 

> 注意步骤3、4是为了绕过war插件的限制，这是一个笨的方法（实测成功）


## 多个jar包启动 ##

    java -jar xxxx.jar  --server.port=0(随机) / --server.port=8085 

## Maven启动 ##

    mvn spring-boot:run