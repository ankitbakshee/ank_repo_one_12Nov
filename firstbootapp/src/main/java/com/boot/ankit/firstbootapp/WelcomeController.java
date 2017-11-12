package com.boot.ankit.firstbootapp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.ankit.entity.Test_Data;



@RestController
@CrossOrigin
public class WelcomeController {
	
	@Autowired
	private TestRepository testRepository;

/*	@GetMapping(value = "/getTrailers", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getTrailers() {
		Student st = new Student();
		st.setFirst("abcd");
		st.setLast("efgh");
		return st;
	}*/
	 @RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "Hello World!";
	    }
	 @GetMapping(path="/getData", produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public List<Test_Data> getStudent(){
		 List<Test_Data> ls= (List<Test_Data>) testRepository.findAll();
		 return ls;
	 }
	 
	 @PostMapping(path="/updateData", consumes = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public List<Test_Data> updateStudent(@RequestBody List<Test_Data> test_data){
		 List<Test_Data> ls = (List<Test_Data>) testRepository.save(test_data);
		 return ls;
	 }

}
