package cn.customize.self.date.format;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description: 时间配置文件映射类
 * @auther: bald ass
 * @date: 2020/6/1 10:15
 */
@ConfigurationProperties(prefix = "date.formatter")
public class DateFormatProperties {
    private String pattern = "yyyy-MM-dd HH:mm:ss";

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
