package com.desenvolvedor.demo;

import com.desenvolvedor.demo.infra.entity.UsuarioConta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAprenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAprenderApplication.class, args);

        UsuarioConta jose = new UsuarioConta();
        System.out.println(jose.getNome());
        jose.setNome("jose Guilherme");
        System.out.println(jose.getNome());

    }

}
