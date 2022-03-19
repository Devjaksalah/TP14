package ma.cigma;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class FrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontEndApplication.class, args);
	}

	@Bean
	// kayt3f fga3 les class okadir lih autowird
	public RestTemplate getRestTemplate() {
		return new RestTemplate();


	}
	@Bean
	PasswordEncoder getPass(){
		return  new BCryptPasswordEncoder();
	}


}
