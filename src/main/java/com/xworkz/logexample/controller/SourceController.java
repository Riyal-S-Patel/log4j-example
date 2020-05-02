package com.xworkz.logexample.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SourceController {

	final static Logger logger = Logger.getLogger(SourceController.class);

	public SourceController() {
		logger.info(this.getClass().getSimpleName() + " obj created using info");
	}

	@RequestMapping("/msg.do")
	public String getMessage(Model model) {
		logger.info("inside getMessage() of controller.....");
		model.addAttribute("message", "Hello all.....!!!!!!");
		try {
			new Throwable("Custom Exception...");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "welcome.jsp";

	}
}
