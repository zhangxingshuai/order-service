package com.dao;

import com.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface OrderDao{
    @Select("SELECT * FROM order")
    List<Order> selectAll();

}
