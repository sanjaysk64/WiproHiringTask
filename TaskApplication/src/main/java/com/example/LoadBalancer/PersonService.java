package com.example.LoadBalancer;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
class PersonService{
	@Autowired
	PersonRepo personRepo;
	
	List<Person>findAll(){
		return personRepo.findAll();
	}
	
	public String getFullName(String name) {
		String s2="",s3="";
		List<Person>p= personRepo.findByFirstName(name);
				for (Person person : p) {
					s3=person.getFirstName();
					s2 =person.getLastName();
					
				}
				return s3+s2;
	}
}