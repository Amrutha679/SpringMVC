package com.mondee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest req,HttpServletResponse res) {
		
		String uname = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("mail");
		String phone = req.getParameter("mobile");
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("username", uname);
		mv.addObject("pwd", pwd);
		mv.addObject("mail", email);
		mv.addObject("mobile",phone);
		
		
		mv.setViewName("display");
		return mv;
		
	}
}
