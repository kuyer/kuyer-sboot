package io.github.kuyer.sboot.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="io.github.kuyer.sboot.dubbo.consumer")
public class DubboConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}

}
