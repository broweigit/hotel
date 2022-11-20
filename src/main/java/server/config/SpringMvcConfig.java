package server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"server.controller", "server.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
