package com.example.LoadBalancer;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,BigInteger>
{
	public List<Person> findByFirstName(String firstName);
}
