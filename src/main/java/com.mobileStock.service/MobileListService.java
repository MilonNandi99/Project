package com.mobileStock.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileStock.entity.MobileList;
import com.mobileStock.repository.MobileListRepository;

@Service
public class MobileListService {

	@Autowired
	private MobileListRepository myMobileRepo;
	
	public void saveMyMobile(MobileList mobile) {
		myMobileRepo.save(mobile);
	}
	
	public List<MobileList> getAllMyMobiles(){
		return myMobileRepo.findAll();
	}
	
	public void deleteById(int id) {
		myMobileRepo.deleteById(id);
	}
}
