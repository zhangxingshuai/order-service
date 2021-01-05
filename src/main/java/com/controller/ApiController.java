package com.controller;

import com.dao.OrderDao;
import com.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("api")
public class ApiController extends BaseController{
    @Resource
    private OrderDao orderDao;

    @GetMapping("test")
    public void test() {
        List<Order> orders = orderDao.selectAll();

        returnSuccess(orders);
    }


}
