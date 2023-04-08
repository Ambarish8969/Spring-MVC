package com.mock2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/first")
	public String second() {
		return "secondpage";
	}
}
