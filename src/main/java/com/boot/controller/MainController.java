package com.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {

	@RequestMapping("/index")
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping("/list")
	public List<String> json() {
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Viju");
		list.add("Amaresh");
		list.add("Damodaran");
		list.add("Hari");
		return list;
	}
}
