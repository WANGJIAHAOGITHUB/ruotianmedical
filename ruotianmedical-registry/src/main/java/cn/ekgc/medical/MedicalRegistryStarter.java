package cn.ekgc.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MedicalRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(MedicalRegistryStarter.class, args);
	}
}
