package com.springboot.nbshop.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@IdClass(OrderDetailPK.class)
@Table(name = "orderdetail")
public class OrderDetail  {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int count;
}
