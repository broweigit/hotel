package server.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean_ = new SqlSessionFactoryBean();
        sqlSessionFactoryBean_.setTypeAliasesPackage("server.domain");
        sqlSessionFactoryBean_.setDataSource(dataSource);

        return sqlSessionFactoryBean_;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer_ = new MapperScannerConfigurer();
        mapperScannerConfigurer_.setBasePackage("server.dao");
        return mapperScannerConfigurer_;
    }
}
