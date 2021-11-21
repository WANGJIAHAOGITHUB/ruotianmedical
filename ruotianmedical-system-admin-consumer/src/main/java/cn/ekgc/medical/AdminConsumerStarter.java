package cn.ekgc.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>系统管理者 - 消费者启动类</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AdminConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(AdminConsumerStarter.class, args);
	}
}
