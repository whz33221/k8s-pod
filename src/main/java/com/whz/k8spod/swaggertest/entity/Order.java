package com.whz.k8spod.swaggertest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "`order`")
public class Order{
    @Id
    @GeneratedValue
    private Integer id;


    private Integer price;


    private String name;

}
