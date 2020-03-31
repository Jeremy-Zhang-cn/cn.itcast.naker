package com.itheima.heimagateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyParamGatewayFilterFactory extends AbstractGatewayFilterFactory<MyParamGatewayFilterFactory.Config> {

	public static final String PARAM_NAME = "param";

	public static class Config {

		private String param;

		public String getParam() {
			return param;
		}

		public void setParam(String param) {
			this.param = param;
		}
	}


	public MyParamGatewayFilterFactory() {
		super(Config.class);
	}

	@Override
	public List<String> shortcutFieldOrder() {
		return Arrays.asList(PARAM_NAME);
	}

	@Override
	public GatewayFilter apply(Config config) {
		return (exchange, chain) -> {
			ServerHttpRequest request = exchange.getRequest();
			if (request.getQueryParams().containsKey(config.param)) {
				request.getQueryParams().get(config.param).forEach(value -> System.out.printf("------局部过滤器%s = %s-------", config.param, value));

			}
			return chain.filter(exchange);
		};
	}
}
