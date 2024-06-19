package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

//		ArrayList<String> msgs = new ArrayList<>();
//
//		Thread enThreader = new Thread(new LanguagesThreader("translation_en_US", msgs));
//		Thread frThreader = new Thread(new LanguagesThreader("translation_fr_CA", msgs));
//		enThreader.start();
//		frThreader.start();
//
//		enThreader.join();
//		frThreader.join();
//
//		System.out.println(msgs);
	}
}
