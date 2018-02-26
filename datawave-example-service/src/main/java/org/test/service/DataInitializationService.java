package org.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DataInitializationService {

	@Transactional
	public void populateDatabase() {
		
	}
}
