package com.amer.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amer.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res){
		
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("display.jsp");
		model.addObject("result",k);
		
		return model;
	}
	
}
