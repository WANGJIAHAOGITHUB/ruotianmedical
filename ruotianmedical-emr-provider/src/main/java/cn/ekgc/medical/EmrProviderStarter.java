package cn.ekgc.medical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>若天医疗电子病历 - 服务端启动类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@MapperScan("cn.ekgc.medical.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class EmrProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(EmrProviderStarter.class, args);
	}
}
