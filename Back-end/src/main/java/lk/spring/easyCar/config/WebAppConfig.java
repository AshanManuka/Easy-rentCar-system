package lk.spring.easyCar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.spring.easyCar.controller")
@EnableWebMvc
public class WebAppConfig {
}
