package com.mermaidline.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Title.
 * <p/>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2014-12-16
 */
@Configuration
@ComponentScan(basePackages = {"com.mermaidline.web"}, excludeFilters = {
        @ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION)
})
@EnableAspectJAutoProxy
public class AppConfig {

}
