package com.github.deen13.rest;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Value("${proxy.host}") String host;
	@Value("${proxy.port}") Integer port;

	@Bean
	public RestTemplate generateRestTemplate() {
		if (host == null || host.trim().isEmpty() || port == null)
			return new RestTemplate();

		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
		requestFactory.setProxy(proxy);

		return new RestTemplate(requestFactory);
	}

}
