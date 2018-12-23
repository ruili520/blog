package com.group.blog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Title:Swagger2
 * @Description:工具类
 * @author：宋志鹏
 * @date：2018-3-10上午11:03:27
 * @company:上海梓擎信息科技有限公司
 */
@Configuration
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.group.blog.controller"))
                .paths(PathSelectors.any())
                .build();
        
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
		        .title("Swagger2——606宿舍博客系统Api构建文档")
				.description("博客系统——后端Controller层接口             注意：本内容仅限于内部传阅，严禁外泄以及用于其他的商业目的")
				.termsOfServiceUrl("")
				.version("1.0")
				.build();
    }
}