package com.example.demo.service;

import com.example.demo.entity.Order;
import com.example.demo.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenpenghui
 * @date 2020-12-3
 */
@SpringBootTest
class OrderServiceTest {

    @Autowired
    OrderServiceImpl orderServiceImpl;

    /**
     * 普通for循环
     */
    @Test
    void testInsertBatchSimple(){
        long t1 = System.currentTimeMillis();
        Order order;
        for (int i = 0; i < 500000; i++) {
            order = new Order();
            order.setName("名称" + i);
            order.setType("类别" + i);
//            orderServiceImpl.insert(order);
        }
        long t2 = System.currentTimeMillis();

        System.out.println("t1=" + t1);
        System.out.println("t2=" + t2);
        System.out.println("批量插入时间: " + (t2 - t1));
    }

    /**
     * mapper中使用foreach
     */
    @Test
    void testInsertBatchForeach() {
        long t1 = System.currentTimeMillis();
        List<Order> list = new ArrayList<>();
        Order order;
        for (int i = 0; i < 100000; i++) {
            order = new Order();
            order.setName("名称" + i);
            order.setType("类别" + i);
            list.add(order);
        }
        long t2 = System.currentTimeMillis();
//        orderServiceImpl.insertBatch1(list);
        long t3 = System.currentTimeMillis();

        System.out.println("t2=" + t2);
        System.out.println("t3=" + t3);
        System.out.println("批量插入时间: " + (t3 - t2));

    }

    /**
     * 使用MP的saveBatch()
     */
    @Test
    void testInsertBatchMP(){
        long t1 = System.currentTimeMillis();
        List<Order> list = new ArrayList<>();
        Order order;
        for (int i = 0; i < 10; i++) {
            order = new Order();
            order.setName("名称" + i);
            order.setType("类别" + i);
            list.add(order);
        }
        long t2 = System.currentTimeMillis();
        orderServiceImpl.saveBatch(list);
        long t3 = System.currentTimeMillis();

        System.out.println("t2=" + t2);
        System.out.println("t3=" + t3);
        System.out.println("批量插入时间: " + (t3 - t2));
    }
}