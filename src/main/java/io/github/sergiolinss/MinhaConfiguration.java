package io.github.sergiolinss;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MinhaConfiguration {
    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de vendas";
    }
    @Bean(name = "OutraConfig")
    public String OutraConfig(){
        return "Sistema de vendas";
    }
}
