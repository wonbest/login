package com.lili.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CtrlLogin {

	@RequestMapping(value = {"login"})
	@ResponseBody
	public String login(String username, String password) {
		return username + " : " + password;
	}
}
