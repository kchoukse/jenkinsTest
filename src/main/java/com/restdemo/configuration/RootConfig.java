package com.restdemo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement(proxyTargetClass=true)
@EnableAspectJAutoProxy
@ComponentScan({"com.restdemo.service"})
@Import(value={HibernateConfig.class})
public class RootConfig {

 

}