package JoseRodolfo.JoseRodolfo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JoseRodolfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoseRodolfoApplication.class, args);
	}

}
