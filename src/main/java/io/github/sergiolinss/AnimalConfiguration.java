package io.github.sergiolinss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {
    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal() {
            @Override
            public void FazerBarulho() {
                System.out.println("au au");
            }
        };
    }
    @Bean(name = "gato")
    public Animal gato(){
        return new Animal() {
            @Override
            public void FazerBarulho() {
                System.out.println("miau");
            }
        };
    }
}
