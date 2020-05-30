# 试着给自己搞一个自定义的springboot工具依赖包


# 安装到本地maven库
1. 在工作目录(就是cd到springboot-utils这个文件夹下)运行`mvn clean install`命令

2. 在需要安装的项目中添加依赖,即可使用 
```xml
        <dependency>
            <groupId>cn.customize.self</groupId>
            <artifactId>springboot-utils</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

# 发布到GitHub上

