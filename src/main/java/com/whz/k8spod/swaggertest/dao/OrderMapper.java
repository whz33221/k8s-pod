package com.whz.k8spod.swaggertest.dao;

import com.whz.k8spod.swaggertest.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends JpaRepository<Order, Integer> {

}
