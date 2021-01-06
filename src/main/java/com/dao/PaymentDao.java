package com.dao;

import com.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PaymentDao {

    @Select("select * from payment")
    List<Payment> selectAll();

    @Insert("insert into payment(order_id, price, payment_status, create_user, create_time) values (#{orderId},#{price},#{paymentStatus},#{createUser}, #{createTime})")
    int insert(Payment payment);
}
