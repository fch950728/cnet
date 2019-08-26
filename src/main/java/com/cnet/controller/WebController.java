package com.cnet.controller;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnet.core.String2DB;
import com.cnet.service.GraphService;

/**
 * 网页控制层
 * @author zodiac
 * @version 1.0
 *
 */
@Controller
public class WebController {
	
	// 载入数据服务层对象，该对象自动注入服务层方法，这些方法用来在controller层把数据注入数据库
	@Autowired
	private GraphService graphService;
	
	// 这个方法匹配HTTP中GET方法，uri为/cnyd的请求
	// request读取GET方法中的表单值
	@GetMapping(value="/cnet")
	@CacheEvict
	public String returnAmount(HttpServletRequest request, Model model)
	{
		String text1 = request.getParameter("text");
		String savedata = request.getParameter("savedata");
		boolean flag = false;
		// 如果有savedate值，表示勾选了存入数据库选项
		if (savedata!=null)
			flag = true;
		// 将uri中被转义的text值转义回来
		try {
			text1= URLDecoder.decode(text1,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String html = String2DB.string2DB(text1,graphService,flag);
		// 在返回的页面中设置相关的信息
		model.addAttribute("result", html);
		model.addAttribute("text", text1);
		 
		 return "index3";
	}
	
}
