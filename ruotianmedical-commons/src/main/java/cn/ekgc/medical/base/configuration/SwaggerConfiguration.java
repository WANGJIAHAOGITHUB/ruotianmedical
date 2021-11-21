package cn.ekgc.medical.base.configuration;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.DocumentationContextBuilder;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <b>系统基础信息类 - Swagger 接口文档生成框架配置类</b>
 * <p>
 *     接口文档访问地址：/swagger-ui/index.html
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Configuration
public class SwaggerConfiguration {
	/**
	 * 配置 swagger api
	 * @return
	 */
	@Bean
	public Docket createAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				// 设置生成文档的相关文件信息
				.apiInfo(apiInfo())
				// 设置 Swagger 扫描注解包位置
				.select()
				.apis(RequestHandlerSelectors.basePackage("cn.ekgc.medical"))
				.build();
	}

	/**
	 * <b>设置 swagger 生成的文档信息</b>
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 接口文档标题
				.title("若天医疗平台 - 交互接口文档")
				.description("前后交互文档")
				.version("1.0.0")
				// 设置项目联系人信息
				.contact(new Contact("WangJiahao", "www.WangJihao.com", "wjh_wmp2021@163.com"))
				.build();
	}
}
