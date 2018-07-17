package com.solution.spring.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.solution.spring.dao.LoginDao;
import com.solution.spring.entity.LoginEntity;

@Controller
@RequestMapping(path = "/")
public class LoginController {

	@Autowired
	private LoginDao loginDao;

	@RequestMapping(path = "/login")
	public String doLogin() {
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setId(13L);
		loginEntity.setName("Web Example!");
		loginEntity.setStartDate(new Date(System.currentTimeMillis()));
		loginDao.persist(loginEntity);
		return "welcome";
	}

}
