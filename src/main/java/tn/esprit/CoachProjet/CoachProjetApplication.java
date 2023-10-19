package tn.esprit.CoachProjet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class CoachProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoachProjetApplication.class, args);
	}

}
