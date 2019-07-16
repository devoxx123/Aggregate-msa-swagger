package io.msa.services.zipkin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZipkinApplication.class).run(args);
	}

	@Bean
	public Sampler alwaysSampler() {
	    return Sampler.ALWAYS_SAMPLE;
	}

}
