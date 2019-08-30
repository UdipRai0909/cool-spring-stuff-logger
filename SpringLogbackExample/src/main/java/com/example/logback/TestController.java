package com.example.logback;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/")
	public String hello(Model model) {
		
		// Create a list to display
		List<Integer> intData = Arrays.asList(444,22,57,69,69);
		
		// log
		System.out.println("\n\n My Logger :: \n");
		logger.debug("Hello from Logback {}", intData);
		
		// place the value of num as intData which we just passed above
		model.addAttribute("num", intData);
		
		// trying to print the temp dir location
		System.out.println("\n\n Directory for my log file :: \n");
		System.out.println(System.getProperty("java.io.tmpdir"));
		
		return "index";
	}
	
	
}
