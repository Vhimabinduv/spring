package com.bhavana.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bhavana.model.Employee;

@Repository("employeeDao") // // bean id="studentDao" in spring-servlet.xml
public class EmployeeDao {
	    
    JdbcTemplate template;
	
	/*
	 * this method set the JdbcTemplate by the Spring framework.
	 */
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	 
    public List<Employee>  getAllEmployee() {   	
   	
    	List<Employee> students = template.query(
			    "select * from student",
			    new RowMapper() {         // RowMapper
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	Employee std = new Employee();
			        	std.setSid((rs.getInt("sid")));
			        	std.setName(rs.getString("name"));
			        	std.setAge(((rs.getInt("age"))));
			            return std;
			        }
			    });
         return students;
    }    
}
