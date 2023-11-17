package com.spring.jdbc;

import java.util.List;

public interface WorkerDao {

	public int insert(Workers worker);

	public int edit(Workers worker);

	public int delete(int id);

	public Workers getWorkerById(int id);
	
	public List<Workers> getWorkers();
}
