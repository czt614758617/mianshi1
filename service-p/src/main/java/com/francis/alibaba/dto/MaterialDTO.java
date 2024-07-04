package com.example.dto;

import entity.User;
import lombok.Data;

import java.io.Serializable;
@Data
public class MaterialDTO implements Serializable {
    private Long id;
    private String name;
    private String createUser;

    private User user;
}
