package com.francis.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: francis
 * @description:  全局过滤器
 * @date: 2021/1/26 7:04
 */
@Component
@Slf4j
public class FrancisGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        List<String> list = exchange.getRequest().getHeaders().getOrDefault("token", new ArrayList<>());
        if (list.isEmpty()) {
            throw new RuntimeException("token must not be null...");
        }

        log.info("==== token: {} ===", list);
        return chain.filter(exchange);
    }

    /**
     * 值越大优先级越低
     * @return
     */
    @Override
    public int getOrder() {
        return 100;
    }
}
