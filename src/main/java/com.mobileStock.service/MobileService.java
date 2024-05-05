
package com.mobileStock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileStock.entity.Mobile;
import com.mobileStock.repository.MobileRepository;

@Service
public class MobileService {

	@Autowired
	private MobileRepository mRepo;
	
	public void save(Mobile m) {
		mRepo.save(m);
	}
	
	public List<Mobile> getAllMobile(){
		return mRepo.findAll();
	}
	
	public Mobile getMobileById(int id) {
		return mRepo.findById(id).get();
	}
	public void deleteById(int id) {
		mRepo.deleteById(id);
	}
}
