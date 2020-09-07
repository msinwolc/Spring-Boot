package com.shixun.orderingsystem.transform;

import com.shixun.orderingsystem.bean.Order;
import com.shixun.orderingsystem.random.getId;

import java.util.ArrayList;
import java.util.List;

public class Transform {
    public List<Object[]> transformOrderToObjects(List<Order> orders){
        List<Object[]> list = new ArrayList<>();
        Object[] object = null;
        String OrderId = new getId().getOrderId();
        for(Order order:orders){
            object = new Object[]{
                    OrderId,
                    order.getFoodName(),
                    order.getFoodPrice(),
                    order.getFoodNumber(),
            };
            list.add(object);
        }
        return list;
    }
}
