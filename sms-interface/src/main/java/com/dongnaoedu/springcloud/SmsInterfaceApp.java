package com.dongnaoedu.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 服务提供者 - 短信接口
@SpringBootApplication
@EnableEurekaClient
public class SmsInterfaceApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(SmsInterfaceApp.class).web(true).run(args);
	}
}
