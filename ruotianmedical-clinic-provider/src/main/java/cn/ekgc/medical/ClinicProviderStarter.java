package cn.ekgc.medical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("cn.ekgc.medical.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class ClinicProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ClinicProviderStarter.class, args);
	}
}
