package com.francis.alibaba.dto;

import com.francis.alibaba.entity.User;
import lombok.Data;

import java.io.Serializable;
@Data
public class MaterialDTO implements Serializable {
    private Long id;
    private String name;
    private String createUser;

    private User user;
}
