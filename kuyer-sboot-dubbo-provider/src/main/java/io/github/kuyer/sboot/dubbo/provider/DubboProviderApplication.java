package io.github.kuyer.sboot.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Dubbo服务提供者启动器
 * @author rory.zhang
 */
@SpringBootApplication
@ComponentScan(basePackages="io.github.kuyer.sboot.dubbo.provider")
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}

}
