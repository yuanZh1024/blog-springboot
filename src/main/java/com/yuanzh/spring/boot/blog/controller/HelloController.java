package com.yuanzh.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 控制器.
 * 
 * @since 1.0.0 2017年7月1日
 * @author <a href="https://yuanzh.com">Yuan Zh</a>
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit yuanzh.com!";
	}
}