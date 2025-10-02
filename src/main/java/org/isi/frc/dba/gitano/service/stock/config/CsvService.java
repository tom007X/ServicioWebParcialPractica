package org.isi.frc.dba.gitano.service.stock.config;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import jakarta.transaction.Transactional;
import org.isi.frc.dba.gitano.service.stock.entities.Auto;
import org.isi.frc.dba.gitano.service.stock.entities.Autoparte;
import org.isi.frc.dba.gitano.service.stock.entities.Pais;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class CsvService {



        /*
        @Autowired
        private AutoparteRepository autoparteRepository;

        @Autowired
        private AutoRepository autoRepository;

        @Autowired
        private PaisRepository paisRepository;*/

        @Transactional
        public void cargarDatosDesdeCsv() throws IOException {
            // Leer y guardar datos de autopartes
            try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/static/autopartes.csv"))) {
                List<String[]> filas = reader.readAll();
                for (String[] fila : filas) {
                    Autoparte autoparte = Autoparte.builder()
                            .codigo(fila[0])
                            .descripcion(fila[1])
                            .parteMotor(Boolean.parseBoolean(fila[2]))
                            .precioUnitario(Double.parseDouble(fila[3]))
                            .stock(Integer.parseInt(fila[4]))
                            .build();

                    //autoparteRepository.save(autoparte);

                    Auto auto = Auto.builder()
                            .marca(fila[5])
                            .modelo(fila[6])
                            .version(fila[7])
                            .build();

                    /*
                    Autoparte autoparte = autoparteRepository.findById(Integer.parseInt(fila[3])).orElse(null);
                    if (autoparte != null) {
                        auto.setAutoparte(autoparte);
                        autoRepository.save(auto);
                    } */

                    Pais pais = Pais.builder()
                            .nombre(fila[8])
                            .build();

                    /*
                    Autoparte autoparte = autoparteRepository.findById(Integer.parseInt(fila[1])).orElse(null);
                    if (autoparte != null) {
                        pais.setAutoparte(autoparte);
                        paisRepository.save(pais);
                    } */


                }
            } catch (CsvException e) {
                throw new RuntimeException(e);
            }

        }
}


