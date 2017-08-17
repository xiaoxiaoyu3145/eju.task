package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.HelloWorldController;
import com.example.demo.data.entity.User;
import com.example.demo.service.HelloWorldService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@InjectMocks
	private  HelloWorldController helloWorldController;
	
	@Mock
	private HelloWorldService helloWorldService;
	
	private String msg = "success";
	
	@Before
	public void setup() {
		Mockito.when(this.helloWorldService.login("xiaoyu", "123456")).thenReturn(msg);
	}
	
	@Test
	public void testLogin() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(this.helloWorldController).build();
		MockHttpServletRequestBuilder builder = post("/hello/login")
				.param("userName", "xiaoyu")
				.param("password", "123456");
		
		mockMvc.perform(builder)
				.andExpect(status().is3xxRedirection()) //请求方式
				.andExpect(request().sessionAttribute("message", msg)) 
				.andExpect(redirectedUrl("/index.html"));
		
	}

	@Test
	public void contextLoads() {
	}

}
