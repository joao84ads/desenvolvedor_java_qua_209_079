package com.crud.app;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
<<<<<<< HEAD

public class DataConfig {
    @Bean
    public DataSource dataSource(){
=======
public class DataConfig {
    @Bean
    public DataSource dataSource() {
>>>>>>> 057acfe (Atualização da aula 12/09/2025)
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_java");
        dataSource.setUsername("root");
<<<<<<< HEAD
        dataSource.setPassword("");
        
        return dataSource();
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter () {
=======
        dataSource.setPassword("Jo@o8459");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
>>>>>>> 057acfe (Atualização da aula 12/09/2025)
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
<<<<<<< HEAD
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        adapter.setPrepareConnection(true);
        
=======
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        adapter.setPrepareConnection(true);

>>>>>>> 057acfe (Atualização da aula 12/09/2025)
        return adapter;
    }
}
