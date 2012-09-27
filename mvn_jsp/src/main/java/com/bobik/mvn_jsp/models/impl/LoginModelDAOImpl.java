package com.bobik.mvn_jsp.models.impl;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginModelDAOImpl {
	private static Logger log = Logger.getLogger(LoginModelDAOImpl.class);
	private static Locale locale = new Locale("uk", "UA");
	private static ResourceBundle rb = ResourceBundle.getBundle("lang", locale);
	private JdbcTemplate jdbcTemplate = null;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getTitle() {
		log.info("Title is called");
		return rb.getString("Who_are_you?");
	}

	public List<String> getDb() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"springconfig.xml");
		ctx.getBean("ttt");
		return null;
	}
}
