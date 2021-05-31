package com.quiztok.comquiztoktest.test.service.impl;

import org.springframework.stereotype.Service;

import com.quiztok.comquiztoktest.test.model.Test;
import com.quiztok.comquiztoktest.test.service.TestService;

@Service
public class TestImpl implements TestService {
	
	private final TestMapper mapper;
	
	public TestImpl(final TestMapper mapper) {
		this.mapper = mapper;
	}
	

	@Override
	public void add(Test test) {
		mapper.add(test);
	}

	@Override
	public void eidt(Test test) {
		
	}

	@Override
	public void remove(String id) {
		
	}

	@Override
	public Test get(String id) {
		return mapper.get(id);
	}

	@Override
	public void list(Test test) {
		
	}


}
