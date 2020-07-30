package com.bida.springHomeWork.demo;

import com.bida.springHomeWork.demo.domain.Producer;
import com.bida.springHomeWork.demo.domain.Product;
import com.bida.springHomeWork.demo.repository.ProductRepository;
import com.bida.springHomeWork.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		Producer p = new Producer();
//		p.setName("KIA");
//		(new ProducerService()).saveProducer(p);
	}

}
