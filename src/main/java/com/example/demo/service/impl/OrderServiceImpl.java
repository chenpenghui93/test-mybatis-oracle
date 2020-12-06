package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenpenghui
 * @date 2020-12-2
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public int insert(Order order){
        return orderMapper.insert(order);
    }

    @Override
    public int insertBatch1(List<Order> list){
        return orderMapper.insertBatch1(list);
    }

    @Override
    public int insertBatch2(List<Order> list){
        return orderMapper.insertBatch2(list);
    }
}
