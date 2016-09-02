package io.github.kuyer.sboot.dubbo.provider.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

/**
 * Dubbo服务提供者配置
 * @author rory.zhang
 */
@Configuration
public class DubboProviderConfig {
	
	@Bean
	@ConfigurationProperties(prefix="spring.dubbo.application")
	public ApplicationConfig applicationConfig() {
		return new ApplicationConfig();
	}
	
	@Bean
	@ConfigurationProperties(prefix="spring.dubbo.registry")
	public RegistryConfig registryConfig() {
		return new RegistryConfig();
	}
	
	@Bean
	@ConfigurationProperties(prefix="spring.dubbo.protocol")
	public ProtocolConfig protocolConfig() {
		return new ProtocolConfig();
	}
	
	@Bean
	public AnnotationBean annotationBean(@Value("${spring.dubbo.packages}") String packages) {
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setPackage(packages);
		return annotationBean;
	}

}
