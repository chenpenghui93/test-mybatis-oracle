package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Order;

import java.util.List;

/**
 * @author chenpenghui
 * @date 2020-12-3
 */
public interface OrderService extends IService<Order> {

    int insert(Order order);

    int insertBatch1(List<Order> list);

    int insertBatch2(List<Order> list);
}
