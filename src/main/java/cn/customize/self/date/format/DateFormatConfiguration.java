package cn.customize.self.date.format;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @description: 时间格式化配置类
 * @auther: bald ass
 * @date: 2020/6/1 10:13
 */
@Configuration
@EnableConfigurationProperties(DateFormatProperties.class)
@ConditionalOnProperty(prefix = "date.formatter", name = "enabled", havingValue = "true")
public class DateFormatConfiguration {
    private DateFormatProperties dateFormatProperties;

    public DateFormatConfiguration(DateFormatProperties dateFormatProperties) {
        this.dateFormatProperties = dateFormatProperties;
    }

    @Bean(name = "simpleDateFormat")
    public SimpleDateFormat myDateFormatter() {
        System.out.println("SimpleDateFormat初始化格式为: " + dateFormatProperties.getPattern());
        return new SimpleDateFormat(dateFormatProperties.getPattern());
    }
}
