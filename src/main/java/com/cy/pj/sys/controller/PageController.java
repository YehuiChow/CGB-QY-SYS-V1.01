package com.cy.pj.sys.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	/**返回首页页面方法定义*/
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "starter";//根据视图解析器的模板设置返回/templates/pages/starter.html页面
	}

	/**返回日志列表页面方法定义*/
	@RequestMapping("log/log_list")
	public String doLogUI() {
		return "sys/log_list";
	}
	
	/**返回分页页面方法定义*/
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "common/page";
	}
}
