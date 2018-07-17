package com.solution.spring.test.dao;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.solution.spring.config.DaoConfiguration;
import com.solution.spring.dao.LoginDao;
import com.solution.spring.entity.LoginEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DaoConfiguration.class })
public class LoginDaoTest {

	@Autowired
	private LoginDao loginDao;

	@Test
	public void doLogin() {
		LoginEntity login = new LoginEntity();
		login.setId(11L);
		login.setName("Naveen");
		login.setStartDate(new Date(System.currentTimeMillis()));
		loginDao.persist(login);
	}
}
