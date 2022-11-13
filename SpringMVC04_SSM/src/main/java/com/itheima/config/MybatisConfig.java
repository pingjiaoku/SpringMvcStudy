package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setTypeAliasesPackage("com.itheima.domain");
        return sqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.itheima.dao");
        return mapperScannerConfigurer;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
        DataSourceTransactionManager ptm = new DataSourceTransactionManager();
        ptm.setDataSource(dataSource);
        return ptm;
    }

}
