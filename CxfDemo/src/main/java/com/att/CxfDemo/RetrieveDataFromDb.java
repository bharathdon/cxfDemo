package com.att.CxfDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.context.annotation.Configuration;

@Configuration
@Path(value = "/emp")
public class RetrieveDataFromDb {

	@GET
	public List<Employee> getEmp() throws SQLException {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bms", "abc");
		String sql = "select * from emp_tbl";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			Employee employee = new Employee();
			employee.setEno(resultSet.getInt("eno"));
			employee.setName(resultSet.getString("name"));
			employee.setSalary(resultSet.getDouble("salary"));
			
			 arrayList.add(employee);
		}
		return arrayList;
				
	}
}
