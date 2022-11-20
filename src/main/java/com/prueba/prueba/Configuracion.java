package com.prueba.prueba;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Configuracion {
    private String server="DESKTOP-3J24IC0";

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        //dataSourceBuilder.url("jdbc:sqlserver://192.168.10.136;databaseName=PRUEBA;trustServerCertificate=true");
        DataSourceBuilder url = dataSourceBuilder.url("jdbc:sqlserver://localhost:1433;databaseName=PRUEBA;IntegratedSecurity=true;trustServerCertificate=true");
        //dataSourceBuilder.username("UCEM_IRENE");
        //dataSourceBuilder.password("1234");
        return dataSourceBuilder.build();
    }

}
