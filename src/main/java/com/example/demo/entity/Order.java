package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author chenpenghui
 * @date 2020-12-2
 */
@Data
@TableName("t_order")
@KeySequence(value = "SEQ_ORDER_1209")
public class Order {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    private String name;
    private String type;
    private Date createTime;
}
