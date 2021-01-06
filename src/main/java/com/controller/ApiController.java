package com.controller;

import com.dao.OrderDao;
import com.dao.PaymentDao;
import com.entity.Order;
import com.entity.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("api")
public class ApiController extends BaseController{
    private final String PAYMENT_URL = "http://PAYMENT-SERVICE";
    @Resource
    private OrderDao orderDao;
    @Resource
    private PaymentDao paymentDao;
    @Resource
    private RestTemplate restTemplate;

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

    @GetMapping("getPaymentById/{id}")
    public void getPaymentById(@PathVariable int id){
        ResponseEntity<Payment> entity = restTemplate.getForEntity(PAYMENT_URL + "/" + id, Payment.class);
        returnSuccess(entity.getBody());
    }



}
