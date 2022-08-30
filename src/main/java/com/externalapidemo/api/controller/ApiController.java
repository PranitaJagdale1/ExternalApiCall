package com.externalapidemo.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url = "https://jsonplaceholder.typicode.com/comments";
	@GetMapping("/reviews")
	public List<Object> getReviews()
	{
		Object[] reviews = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(reviews);
	}
}
