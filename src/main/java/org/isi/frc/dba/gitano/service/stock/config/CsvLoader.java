package org.isi.frc.dba.gitano.service.stock.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CsvLoader implements CommandLineRunner {


    private final CsvService csvService;

    public CsvLoader(CsvService csvService) {
        this.csvService = csvService;
    }


    @Override
    public void run(String... args) throws Exception {

        csvService.cargarDatosDesdeCsv();
        System.out.println("Datos cargados desde CSV al iniciar la aplicación.");

    }
}

