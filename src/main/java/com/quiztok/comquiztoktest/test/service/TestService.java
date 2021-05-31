package com.quiztok.comquiztoktest.test.service;

import com.quiztok.comquiztoktest.test.model.Test;

public interface TestService {
	void add(Test test);
	void eidt(Test test);
	void remove(String id);
	Test get(String id);
	void list(Test test);
}
