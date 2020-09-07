package com.shixun.orderingsystem.service;

import com.shixun.orderingsystem.bean.Food;
import com.shixun.orderingsystem.bean.Order;
import com.shixun.orderingsystem.transform.Transform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    @Override
    public List<Food> queryFoodList() {
        String sql = "select * from food";
        List<Food> list = jdbcTemplate.query(sql, new RowMapper<Food>() {
            @Override
            public Food mapRow(ResultSet resultSet, int i) throws SQLException {
                Food food = new Food();
                food.setFoodName(resultSet.getNString("food_name"));
                food.setFoodPrice(resultSet.getDouble("food_price"));
                food.setFoodNumber(resultSet.getInt("food_number"));
                food.setFoodType(resultSet.getNString("food_type"));
                food.setImgUrl(resultSet.getNString("img_url"));
                return food;
            }
        });
        return list;
    }

    @Transactional
    @Override
    public List<Order> queryOrderList() {
        String sql = "select * from orderlist";
        List<Order> list = jdbcTemplate.query(sql, new RowMapper<Order>() {
            @Override
            public Order mapRow(ResultSet resultSet, int i) throws SQLException {
                Order order = new Order();
                order.setOrderId(resultSet.getNString("order_id"));
                order.setFoodName(resultSet.getNString("food_name"));
                order.setFoodPrice(resultSet.getDouble("food_price"));
                order.setFoodNumber(resultSet.getInt("food_number"));
                return order;
            }
        });
        return list;
    }

    @Transactional
    @Override
    public void deleteById(String orderId) {
        String sql = "delete from orderlist where order_id = ?";
        jdbcTemplate.update(sql,orderId);
    }

    @Override
    public String addOrder(List<Order> list) {
        String sql = "insert into orderlist set order_id = ?,food_name=?,food_price=?,food_number=?";
//        for(Order order:list){
//            return String.valueOf(jdbcTemplate.update(sql,new getId().getOrderId(),order.getFoodName(),order.getFoodPrice(),order.getFoodNumber()));
//        }
        List<Object[]> args = new Transform().transformOrderToObjects(list);
        return String.valueOf(jdbcTemplate.batchUpdate(sql,args));
    }

    @Override
    public BigDecimal totalMoney(List<Order> list) {
//        double count = 0.0;
        BigDecimal count = new BigDecimal("0.0".toString());
        for(Order order : list){
            BigDecimal price = new BigDecimal(Double.toString(order.getFoodPrice()));
            BigDecimal number = new BigDecimal(Double.toString(order.getFoodNumber()));
            count = price.multiply(number).add(count);
//            count += (order.getFoodPrice()*order.getFoodNumber());
        }
        return count;
    }
}
