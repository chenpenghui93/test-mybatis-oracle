package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenpenghui
 * @date 2020-12-2
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

//    int insert(Order order);

    int insertBatch1(List<Order> list);

    int insertBatch2(List<Order> list);
}
