package ee.annjakubel.petmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PetManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetManagerApplication.class, args);
	}

}
