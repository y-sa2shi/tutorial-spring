package com.example.demo;

import com.example.demo.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiSampleApplication {

	/**
	 * Spring boot起動
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args)
				.getBean(DiSampleApplication.class).execute();
	}

	/*注入される個所(インターフェース)*/
	@Autowired
	private Greet g;

	private void execute() {
		String msg = g.greeting();
		System.out.println(msg);
	}

}
