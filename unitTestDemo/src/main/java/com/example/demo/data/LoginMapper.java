package com.example.demo.data;

import com.example.demo.data.entity.User;

public interface LoginMapper {
	User select(String userName, String password);
}
