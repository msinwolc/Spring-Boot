package com.shixun.orderingsystem.service;

import com.shixun.orderingsystem.bean.Food;
import com.shixun.orderingsystem.bean.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface OrderService {

    List<Food> queryFoodList();
    List<Order> queryOrderList();
    void deleteById(String orderId);
    String addOrder(List<Order> list);
    BigDecimal totalMoney(List<Order> list);
}
