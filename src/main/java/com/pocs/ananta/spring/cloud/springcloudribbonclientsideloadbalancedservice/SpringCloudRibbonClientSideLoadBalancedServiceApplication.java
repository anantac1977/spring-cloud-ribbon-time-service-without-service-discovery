package com.pocs.ananta.spring.cloud.springcloudribbonclientsideloadbalancedservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudRibbonClientSideLoadBalancedServiceApplication {

	@Value("${server.port}")
	private int port;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonClientSideLoadBalancedServiceApplication.class, args);
	}
	
	@GetMapping
	public String getTime(){
		
		return "The Current Time is "+new Date().toString()+" from service running on port number"+ port;
	}
}
