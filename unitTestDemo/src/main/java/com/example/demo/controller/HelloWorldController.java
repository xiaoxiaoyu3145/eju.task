package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.User;
import com.example.demo.service.HelloWorldService;

@RestController  
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping(value = "/login")
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		String loginMessage = helloWorldService.login(userName, password);
		
		if (StringUtils.isNotEmpty(loginMessage) && loginMessage.equals("success")) {
			request.getSession().setAttribute("message", loginMessage);
			response.sendRedirect("/index.html");
		} else {
			request.setAttribute("message", loginMessage);
		}
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public String showHelloWorld() {
		return "已经开了" + helloWorldService.showStoreOpenCount() + "家门店啦！";
	}
}
