package io.github.sergiolinss;
import io.github.sergiolinss.annotations.Cachorro;
import io.github.sergiolinss.annotations.Gato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SalesApplication {

   @Value("${application.name}") // escaneia o application.properties
    private String applicationName;

  @Cachorro
   private Animal cachorro;
  @Gato
  private Animal gato;

   @Bean(name = "executarAnimal")
   public CommandLineRunner executar(){
       return args -> {
           this.cachorro.FazerBarulho();
       };
   }
   @Bean(name = "executarGato")
   public CommandLineRunner executarGato(){
       return args -> {
           this.gato.FazerBarulho();
       };
   }

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class, args);
    }
}
