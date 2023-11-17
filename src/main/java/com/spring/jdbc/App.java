package com.spring.jdbc;
// this is our Spring JDBC project where user can add Worker and user can remove worker 
//and user can update worker and user can see one worker and see all our workers 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/jdbc/hello.xml");
		WorkerDaoImpl workerdao = ac.getBean("workerimpl", WorkerDaoImpl.class);

//		Workers worker = new Workers();
//		worker.setId(104);
//		worker.setName("rishabh gupta");
//		worker.setAge(22);
//		worker.setCity("Lucknow");
//		worker.setDesg("java developer");
//
//		int result = workerdao.edit(worker);

		// Workers worker = workerdao.getWorkerById(102);
		List<Workers> workers = workerdao.getWorkers();
		for (Workers worker : workers) {
			System.out.println(worker);
		}

	}
}
