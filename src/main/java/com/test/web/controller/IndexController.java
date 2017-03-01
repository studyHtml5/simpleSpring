package com.test.web.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.service.IndexService;

@RestController
public class IndexController {
	
	@Autowired
	private IndexService indexService;

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public HashMap<String,String> index() {
		return indexService.getData(1);
	}
	
}