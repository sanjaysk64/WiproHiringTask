package com.example.LoadBalancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@GetMapping("getAll")
	List<Person>getAll()
	{
		return personService.findAll();
	}
	@GetMapping("getFullNames/{firstName}")
	public String getFullName(@PathVariable String firstName )
	{
		return personService.getFullName(firstName);
	}
}
