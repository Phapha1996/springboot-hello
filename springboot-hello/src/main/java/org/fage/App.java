package org.fage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年10月30日
 * @description 创建步骤：
 * 						1.先创建maven web项目 
 *						2.继承parent，增加springboot-web依赖,配置打包标签
 *						3.配置application.yml
 *						4.创建运行文件App.java
 *						5.用java -jar 文件.jar 进行运行
 */

@SpringBootApplication
@RestController
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@RequestMapping("/")
	public String hello(){
		return "hello-SpringBootApp!!";
	}
}
