package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cy.pj.sys.service.SysDeptService;
import com.cy.pj.common.vo.JsonResult;
@Controller
@RequestMapping("/dept/")
public class SysDeptController {
	@Autowired
	private SysDeptService sysDeptService;
	@RequestMapping("doFindObjects")
	@ResponseBody
	 public JsonResult doFindObjects(){
		 return new JsonResult(sysDeptService.fianObjects());
	 }
}
