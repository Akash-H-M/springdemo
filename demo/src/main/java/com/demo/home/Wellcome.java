package com.demo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wellcome {
     @GetMapping
	public String home()
	{
		return "welcome to devops";
	}
}
