package com.francis.alibaba.controller;

import com.francis.alibaba.dto.MaterialDTO;
import com.francis.alibaba.service.impl.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private MaterialService materialService;
    @GetMapping("/q13")
    public List<MaterialDTO> q13() {
        return materialService.question1And3("user1", "item1");
    }


}
