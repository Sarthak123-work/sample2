package com.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	
	@RequestMapping("/welcome")
	public String getMsg() {
		
		return "Hello Everyone";
	}

	@RequestMapping("/getData")
	public String getData(@RequestParam("name") String n, @RequestParam("number") int num ) {
		System.out.println(n);
		System.out.println(num);
		
		return "Succesfully Fetched";
	}
	
	@RequestMapping("/getDataPV/{name}/{number}")
	public String getDataUsingPathVariable(@PathVariable ("name") String na, @PathVariable("number") int num) {
		System.out.println(na);
		System.out.println(num);
		
		return "Succesfully Fetched";
	}
	
	
//Practice
	
	@RequestMapping("/idQP")
	public String getDataid(@RequestParam("id") int n) {
		System.out.println(n);
		
		return "id Displayed Using Query Parameter";
	}
	
	@RequestMapping("/nameQP")
	public String getDataid(@RequestParam("nam,e") String n) {
		System.out.println(n);
		
		return "name Displayed Using Query Parameter";
	}
	
	@RequestMapping("/addressQP")
	public String getDataAddress(@RequestParam("Address") String n) {
		System.out.println(n);
		
		return "Address Displayed Using Query Parameter";
	}
	
	@RequestMapping("/salaryQP")
	public String getDatasalary(@RequestParam("salary") double n) {
		System.out.println(n);
		
		return "Salary Displayed Using Query Parameter";
	}
	
	@RequestMapping("/ageQP")
	public String getDataage(@RequestParam("age") int n) {
		System.out.println(n);
		
		return "Age Displayed Using Query Parameter";
	}
	
	
	@RequestMapping("/idPP/{id}")
	public String getDataidPP(@PathVariable("id") int n) {
		System.out.println(n);
		
		return "id Displayed Using Path Parameter";
	}
	
	@RequestMapping("/namePP/{name}")
	public String getDatanamePP(@RequestParam("name") String n) {
		System.out.println(n);
		
		return "name Displayed Using Path Parameter";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/getUser")
	public void getUserData() {
		
	}
	
	
	
}
