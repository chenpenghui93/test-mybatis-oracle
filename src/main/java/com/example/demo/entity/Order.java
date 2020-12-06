package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author chenpenghui
 * @date 2020-12-2
 */
@Data
public class Order {
    private Long id;
    private String name;
    private String type;
    private Date createTime;
}
