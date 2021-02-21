package com.glaucus.glaucus.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.glaucus.Repository.NumberRepository;
import com.glaucus.glaucus.face.NumberIncrementer;

@Service
public class NumberIncrementImpl implements NumberIncrementer {

	@Autowired
	NumberRepository numRepo;

	CompletableFuture<Integer> future = new CompletableFuture<>();
	

	@Override
	public synchronized boolean incrimentNumber() {
		try {
			//will update sql int column by 1
			numRepo.UpdateNumberField();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
