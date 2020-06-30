package com.webapp.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControloler {
  
	@RequestMapping("home")
	public String home(HttpServletRequest req) 
	{
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		session.setAttribute("name", name);
      System.out.println("Hello" + name);
      return "home";
     }
}
