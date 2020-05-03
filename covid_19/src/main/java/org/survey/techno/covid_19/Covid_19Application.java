package org.survey.techno.covid_19;
/*
 * can uncomented the CommandLineRunner if in case DB doesn't gets connected 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.survey.techno.covid_19.entity.Survey;
import org.survey.techno.covid_19.repository.Covid_19Repository;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Covid_19Application // implements CommandLineRunner
{

//	@Autowired
//	private Covid_19Repository covid_19Repo;
	public static void main(String[] args) {
		SpringApplication.run(Covid_19Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//	covid_19Repo.save(new Survey(1L, "MAHARASHTRA ", "INDIA ",  67, 59));
//		covid_19Repo.save(new Survey(2L, "KARNATAKA ", "INDIA ",  56, 59));
//		covid_19Repo.save(new Survey(3L, "KERALA ", "INDIA ", 67, 50));
//		covid_19Repo.save(new Survey(4L, "PUNJAB ", "INDIA ", 77, 49));
//		covid_19Repo.save(new Survey(5L, "RAJASTHAN ", "INDIA ", 27, 89));
//		covid_19Repo.save(new Survey(6L, "GUJURAT ", " INDIA ", 37, 39));
//}
}

