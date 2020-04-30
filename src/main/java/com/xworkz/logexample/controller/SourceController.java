package com.xworkz.logexample.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SourceController {

	final static Logger logger = Logger.getLogger(SourceController.class);

	public SourceController() {
		// System.out.println(this.getClass().getSimpleName() + "obj created");
		logger.info(this.getClass().getSimpleName() + " obj created using info");
		logger.warn(this.getClass().getSimpleName() + " obj created using warn");
		logger.fatal(this.getClass().getSimpleName() + "obj created using fatal");
		logger.error(this.getClass().getSimpleName() + "obj created using error");
	}

	@RequestMapping("/msg.do")
	public String getMessage(Model model) {
		//System.out.println("inside getMessage().....");
		logger.info("inside getMessage().....");
		model.addAttribute("message", "Hello all.....!!!!!!");
		return "welcome.jsp";

	}
}
