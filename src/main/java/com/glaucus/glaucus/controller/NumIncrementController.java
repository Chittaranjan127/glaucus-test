package com.glaucus.glaucus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.glaucus.impl.NumberIncrementImpl;

@RestController
@RequestMapping("/api")
public class NumIncrementController {

	@Autowired NumberIncrementImpl numInc;
	
	@GetMapping("/incriment")
	public Boolean incrementNumber() {
		return numInc.incrimentNumber();
	}
}
