package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenpenghui
 * @date 2020-12-2
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderServiceImpl orderServiceImpl;

    @PostMapping("/insert")
    public int insert(@RequestBody Order order){
        return orderServiceImpl.insert(order);
    }

    @PostMapping("/insertBatch")
    public int insertBatch(@RequestBody List<Order> list){
        return orderServiceImpl.insertBatch1(list);
    }
}
