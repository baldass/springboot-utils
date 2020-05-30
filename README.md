# 试着给自己搞一个自定义的springboot工具依赖包


## 安装到本地maven库
1. 在工作目录(就是cd到springboot-utils这个文件夹下)运行`mvn clean install`命令

2. 在需要安装的项目中添加依赖,即可使用 
```xml
        <dependency>
            <groupId>cn.customize.self</groupId>
            <artifactId>springboot-utils</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

## 发布到GitHub上  
+ 直接使用: 引入如下依赖:
  ```xml
   <repositories>
        <repository>
            <id>github-custom-utils</id>
            <name>自定义的工具包</name>
            <url>https://baldass.github.io/springboot-utils/maven-repo/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>cn.customize.self</groupId>
            <artifactId>springboot-utils</artifactId>
            <version>0.0.1</version>
        </dependency>
    </dependencies>
  ``` 
   
+ 发布到自己的GitHub上,引用自己GitHub
   1. 在项目根目录下运行Maven命令`mvn clean package deploy`;

   2. 将这个项目推送到你的GitHub上,选择`Settings-GitHub Pages`,选择`master branch`启用Pages服务。
      ![示例](./img/upload_github_1.png) 
   3. 在项目的`pom.xml`中引入自己的github地址:  
      ```xml
         <repositories>
              <repository>
                  <id>github-custom-utils</id>
                  <name>自定义的工具包</name>
                  <url>https://你自己的github地址/maven-repo/</url>
              </repository>
          </repositories>
      
          <dependencies>
              <dependency>
                  <groupId>cn.customize.self</groupId>
                  <artifactId>springboot-utils</artifactId>
                  <version>0.0.1</version>
              </dependency>
          </dependencies>
      ```
      
## 发布到私有库上