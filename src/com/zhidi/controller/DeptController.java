package com.zhidi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhidi.entity.Dept;
import com.zhidi.service.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private IDeptService deptService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Dept> list = deptService.getAll();
		model.addAttribute("list", list);
		return "dept/list";
	}
	
	@ResponseBody
	@RequestMapping("/doAjax")
	public List<Dept> list() {
		List<Dept> list = deptService.getAll();
		//需要将有关联属性的实体转化为JSON格式数据，会去查询关联属性，此时session以及被关闭了，所以会抛一个no session异常
		return list;
	}
}
