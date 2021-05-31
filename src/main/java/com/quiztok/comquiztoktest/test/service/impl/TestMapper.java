package com.quiztok.comquiztoktest.test.service.impl;

import org.apache.ibatis.annotations.Mapper;

import com.quiztok.comquiztoktest.test.model.Test;

@Mapper
public interface TestMapper {
	void add(Test test);
	
	Test get(String id);
}
