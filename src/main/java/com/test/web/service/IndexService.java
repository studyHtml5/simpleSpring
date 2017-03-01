package com.test.web.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.mapper.IndexMapper;

@Service
public class IndexService {

	@Autowired
	private IndexMapper indexMapper;
	
	public HashMap<String, String> getData(int seq) {
		return indexMapper.getData(seq);
	}
}