package com.go2q.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class HomeController {

	@RequestMapping(value="/dashboard", method= RequestMethod.GET)
	public String dashboard() {
		
		return "admin.dashboard";
	}
	
	@RequestMapping(value="/desklist", method= RequestMethod.GET)
	public String desklist() {
		
		return "admin.desklist";
	}
	
	@RequestMapping(value="/createdesk", method= RequestMethod.GET)
	public String createdesk() {
		
		return "admin.createdesk";
	}
}
