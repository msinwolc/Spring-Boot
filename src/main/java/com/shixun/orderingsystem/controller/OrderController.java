package com.shixun.orderingsystem.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shixun.orderingsystem.bean.Food;
import com.shixun.orderingsystem.bean.Order;
import com.shixun.orderingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "foodlist")
    public List<Food> foodList(){
        return orderService.queryFoodList();
    }

    @RequestMapping(value = "orderlist")
    public List<Order> orderList(){
        return orderService.queryOrderList();
    }

//    @RequestMapping(value = "orderMoney")
//    public String order(@RequestBody String list){
//        List<Food> foods = JSON.parseArray(list, Food.class);
//
//    }

    @RequestMapping(value = "deleteorder")
    public String delete(String orderId){
        orderService.deleteById(orderId);
        return orderId;
    }


    @RequestMapping(value = "order")
    public BigDecimal orderList(@RequestBody String list){

        List<Order> orders = JSON.parseArray(list, Order.class);
        orderService.addOrder(orders);
        return orderService.totalMoney(orders);
    }
//    @RequestMapping(value = "test")
//    public String uuID(){
//
//        return new getId().getOrderId();
//    }
}
