package com.recruit.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recruit.domain.AmainVO;
import com.recruit.service.AmainService;

@Controller
@RequestMapping("/admin/*")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	private AmainService service;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainGET(Locale locale, Model model) throws Exception {
		return "admin/A_main";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(AmainVO vo, Model model) throws Exception {
	
//		logger.info("modify post...........");
//		logger.info(vo.toString());
//		
//		service.modify(vo);
//		
//		model.addAttribute("result", "success");
		
		return "admin/A_modify";
	}
}
