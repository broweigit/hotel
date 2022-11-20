package server.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource_ = new DruidDataSource();
        dataSource_.setDriverClassName(driver);
        dataSource_.setUrl(url);
        dataSource_.setUsername(username);
        dataSource_.setPassword(password);
        return dataSource_;
    }
}
