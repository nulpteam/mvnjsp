package com.bobik.mvn_jsp.models.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bobik.mvn_jsp.models.LoginModelDAO;
import com.bobik.mvn_jsp.models.TestTable;

public class LoginModelDAOImpl implements LoginModelDAO{
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

	

	public List<TestTable> getFromDB(String sql) {
		List <TestTable> ttt = jdbcTemplate.query(sql, new  RowMapper<TestTable>(){

			public TestTable mapRow(ResultSet rs, int arg1) throws SQLException {
				TestTable tt = new TestTable();
				tt.setId(rs.getString(1));
				tt.setName(rs.getString(2));
				//System.out.println(tt.getId());
				//System.out.println(tt.getName());
				return tt;
			}
			});
		
		return ttt;
	}
}
