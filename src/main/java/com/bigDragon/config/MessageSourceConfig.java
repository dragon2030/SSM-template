package com.bigDragon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * 自定义messageSource开启国际化，spring容器启动时会加载messageSource，如果没有自定义会加载默认
 * 可以自定义ResourceBundle 指定加载properties文件读取编码为utf-8，这样就不用改动枚举和常量源文件了,在配置文件中直接用个人中心=personal center
 */
@Configuration
public class MessageSourceConfig {
    @Bean
    public ResourceBundleMessageSource messageSource() {

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        //可以指定国际化化配置文件的位置，格式：路径/文件名称,注意不包含【语言_国家.properties】含这部分
        messageSource.setBasenames("conf/i18n/message"); //@1
        messageSource.setDefaultEncoding("UTF-8"); // 设置默认编码为 UTF-8
        messageSource.setFallbackToSystemLocale(false);
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setFallbackToSystemLocale(false);
//        messageSource.setB(new CustomResourceBundleControl("UTF-8")); // 使用自定义的 ResourceBundle.Control
        return messageSource;
    }
}