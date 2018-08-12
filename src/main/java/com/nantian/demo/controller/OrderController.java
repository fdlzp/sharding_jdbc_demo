package com.nantian.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nantian.demo.entity.Order;
import com.nantian.demo.service.DemoService;
import com.nantian.demo.vo.ResultInfo;

@Controller
@RequestMapping("/order")
public class OrderController {
	private DemoService demoService;

	@Autowired
	public OrderController(DemoService demoService) {
		this.demoService = demoService;
	}
	
	@RequestMapping("/addOrder")
    @ResponseBody
	public ResultInfo addOrder() {
		ResultInfo resultInfo = new ResultInfo();
		try {
			demoService.addOrder();
			resultInfo.setSuccess("true");
		} catch (Exception e) {
			resultInfo.setSuccess("false");
			resultInfo.setError(e.getMessage());
		}
		return resultInfo;
	}
	
	@RequestMapping("/findAll")
    @ResponseBody
	public ResultInfo findAll() {
		ResultInfo resultInfo = new ResultInfo();
		try {
			List<Order> orders = demoService.findAll();
			resultInfo.setData(orders);
			resultInfo.setSuccess("true");
		} catch (Exception e) {
			resultInfo.setSuccess("false");
			resultInfo.setError(e.getMessage());
		}
		return resultInfo;
	}
}
