package com.controller;

import com.dao.OrderDao;
import com.dao.PaymentDao;
import com.entity.Order;
import com.entity.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("api")
public class ApiController extends BaseController{
    @Resource
    private OrderDao orderDao;
    @Resource
    private PaymentDao paymentDao;

    @GetMapping("test")
    public void test() {
        List<Order> orders = orderDao.selectAll();

        returnSuccess(orders);
    }

    @PostMapping("createPayment")
    public void createPayment(@RequestBody Payment payment){
        int insert = paymentDao.insert(payment);
        returnSuccess(insert);
    }


}
