package com.intesasanpaolo.cos2noc.ws;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class Cos2NocServiceImpl {
	//private static final List<Country> countries = new ArrayList<Country>();

	// after creation
	@PostConstruct
	public void initData() {
		
	}

	public String doSomething(String name) {
		Assert.notNull(name, "doSomething called with null object");
		return "Hello World";
	}
}
