package com.bigDragon.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author bigDragon
 */
@Controller
@RequestMapping("/test")
public class TestContorller {
	private static final Logger logger = LoggerFactory.getLogger(TestContorller.class);
	private static String testUpdateStateFlag="1";

	@RequestMapping(value = "/demo")
	public ModelAndView testJsp(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("demo");
		return modelAndView;
	}
	@RequestMapping("/success2")
	public String success2(Map<String,Object> map){
		map.put("hello","你好");
		return "success2";
	}

}
