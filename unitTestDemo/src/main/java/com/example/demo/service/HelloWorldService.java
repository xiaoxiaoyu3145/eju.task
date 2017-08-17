package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.LoginMapper;
import com.example.demo.data.StoreOpenMapper;
import com.example.demo.data.entity.User;


@Service
public class HelloWorldService {
	
	@Autowired
	private StoreOpenMapper storeOpenMapper;
	
	@Autowired
	private LoginMapper loginMapper;

	public int showStoreOpenCount() {
		return storeOpenMapper.count();
	}

	public String login(String userName, String password){
		try {
			User user = loginMapper.select(userName, password);
			if (user != null) {
				return "success";
			}else {
				return "failure";
			}
		} catch (Exception e) {
			throw new RuntimeException("login error");
		}
	}
	
}
