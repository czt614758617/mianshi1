package com.francis.test.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.francis.common.entity.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: francis
 * @description:
 * @date: 2021/1/23 22:35
 */
@Slf4j
@RestController
public class TestController {

    @Value("${server.port:8090}")
    private int port;

    @SentinelResource(value = "/gateway/{str}")
    @GetMapping("/gateway/{str}")
    public ResultVo<String> testOne(@PathVariable String str) {
        log.info("================= testOne, port={}", port);
        return new ResultVo<>().success(str);
    }

    @GetMapping("/info")
    public ResultVo<String> testTwo(@RequestParam("name") String name) {
        log.info("================= testTwo, port={}", port);
        return new ResultVo<>().success(name);
    }
}

