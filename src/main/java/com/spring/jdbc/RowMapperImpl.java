package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper {

	public Workers mapRow(ResultSet rs, int rowNum) throws SQLException {
		Workers worker = new Workers();
		worker.setId(rs.getInt(1));
		worker.setName(rs.getString(2));
		worker.setCity(rs.getString(3));
		worker.setAge(rs.getInt(4));
		worker.setDesg(rs.getString(5));
       return worker;
	}

}
