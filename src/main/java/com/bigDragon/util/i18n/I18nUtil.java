package com.bigDragon.util.i18n;

import com.bigDragon.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Slf4j
public class I18nUtil {
    //cookie中的国际化
    public static final String COOKIE_I18N="userLanguage";
    public static final String COOKIE_I18N_EN="en";
    public static final String COOKIE_I18N_CN="cn";

    //java中使用java.util.Locale来表示地区语言这个对象
    public static Locale getLocale() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attrs != null) {
            HttpServletRequest request = attrs.getRequest();

            // 获取所有的 cookies
            Cookie[] cookies = request.getCookies();

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    // 可以根据 cookie 的名字来处理特定的 cookie
                    if (COOKIE_I18N.equals(cookie.getName())) {
                        String cookieValue = cookie.getValue();
                        // 对特定 cookie 值的处理...
                        if (StringUtils.isNotBlank(cookieValue)) {
                            if (COOKIE_I18N_EN.equals(cookieValue)) {
                                return Locale.US;
                            }//为cn就是 默认 都用中文
                        }

                    }
                }
            }
        }

        return Locale.CHINA;
    }

    //选择国家化语言后进行文字转换
    public static String chooseLanguageCoverMsg(String message) {
        if (StringUtils.isBlank(message)) {
            return message;
        }
        String coverLanguageMsg = null;
        try {
            ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();
            Locale locale = I18nUtil.getLocale();
            coverLanguageMsg = applicationContext.getMessage(message, null, locale);

        } catch (Exception e) {
            log.info("国际化转换类异常：" + e);
            return message;
        }

        if (StringUtils.isBlank(coverLanguageMsg)) {
            return message;
        }//如果没有配置国际化 就用原本的值
        return coverLanguageMsg;
    }
}