package cn.ekgc.medical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>系统管理者 - 服务端启动类</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@MapperScan("cn.ekgc.medical.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class AdminProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(AdminProviderStarter.class, args);
	}
}
