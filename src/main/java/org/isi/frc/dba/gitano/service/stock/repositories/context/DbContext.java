package org.isi.frc.dba.gitano.service.stock.repositories.context;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbContext {

    @Bean
    public EntityManagerFactory entityManagerFactory(){
        return Persistence.createEntityManagerFactory("autopartista");
    }

    @Bean
    public EntityManager getentityManager(EntityManagerFactory emf){
        return emf.createEntityManager();
    }
}
