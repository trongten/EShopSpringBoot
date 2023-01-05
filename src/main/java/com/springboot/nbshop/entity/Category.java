package com.springboot.nbshop.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int id;

    @Column(name = "name", columnDefinition = "nvarchar(255)")
    private String name;

}//create table mapping trong db
