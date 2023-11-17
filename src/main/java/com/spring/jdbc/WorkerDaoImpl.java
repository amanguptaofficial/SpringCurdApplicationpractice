package com.spring.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class WorkerDaoImpl implements WorkerDao {

	private JdbcTemplate jtemple;

	@Override
	public String toString() {
		return "WorkerDaoImpl [jtemple=" + jtemple + "]";
	}

	public WorkerDaoImpl() {
		super();
	}

	public WorkerDaoImpl(JdbcTemplate jtemple) {
		super();
		this.jtemple = jtemple;
	}

	public JdbcTemplate getJtemple() {
		return jtemple;
	}

	public void setJtemple(JdbcTemplate jtemple) {
		this.jtemple = jtemple;
	}

	public int insert(Workers worker) {
		String q = "insert into workers(id,name,city,age,desg) values(?,?,?,?,?)";

		int result = this.jtemple.update(q, worker.getId(), worker.getName(), worker.getCity(), worker.getAge(),
				worker.getDesg());

		return result;
	}

	public int edit(Workers worker) {
		String q = "update workers set name=?,city=?,age=?,desg=? where id=?";

		int result = this.jtemple.update(q, worker.getName(), worker.getCity(), worker.getAge(), worker.getDesg(),
				worker.getId());
		return result;
	}

	public int delete(int id) {
		String q = "delete from workers where id=?";
		int result = this.jtemple.update(q, id);
		return result;
	}

	public Workers getWorkerById(int id) {
		String query = "select*from workers where id=?";
		RowMapper<Workers> rowmap = new RowMapperImpl();
		Workers worker = this.jtemple.queryForObject(query, rowmap, id);
		return worker;
	}

	public List<Workers> getWorkers() {
		String query = "select*from workers";
		RowMapper<Workers> rowmap = new RowMapperImpl();
		List<Workers> worker = this.jtemple.query(query, rowmap);
		return worker;
	}

}
