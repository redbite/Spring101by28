package com.example.helloWorldAPI.AOP.business_dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	public String retrieveSomething() {
		return "Dao2";
	}
}
