package com.mermaidline.repository.config;

import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

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
@ComponentScan(basePackages = {"org.mermaidline.repository"})
@EnableTransactionManagement
public class RepositoryConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public TransactionAwareDataSourceProxy transactionAwareDataSource() {
        return new TransactionAwareDataSourceProxy(dataSource);
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider(transactionAwareDataSource());
    }

    @Bean
    public DefaultConfiguration config() {
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        defaultConfiguration.setConnectionProvider(connectionProvider());
        defaultConfiguration.set(SQLDialect.MYSQL);
        return defaultConfiguration;
    }

    @Bean
    public DefaultDSLContext dsl() {
        return new DefaultDSLContext(config());
    }

}
