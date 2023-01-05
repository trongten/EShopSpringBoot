package com.springboot.nbshop.entity;

import lombok.Data;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type="org.hibernate.type.StringNVarcharType")
    @Column(name = "name",columnDefinition = "nvarchar(255)")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    private double price;

    private double weight;
    @Column(name = "description",columnDefinition = "nvarchar(255)")
    private String description;

    private String imageName;

}//create table mapping trong db
