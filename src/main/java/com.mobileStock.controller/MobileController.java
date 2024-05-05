package com.mobileStock.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.mobileStock.entity.Mobile;
import com.mobileStock.entity.MobileList;
import com.mobileStock.service.MobileListService;
import com.mobileStock.service.MobileService;

import java.util.*;

@Controller
public class MobileController {

	@Autowired
	private MobileService service;
	
	@Autowired
	private MobileListService mobileListService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/mobile_register")
	public String mobileRegister() {
		return "mobileRegister";
	}
	
	@GetMapping("/available_mobiles")
	public ModelAndView getAllMobile() {
		List<Mobile>list=service.getAllMobile();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return new ModelAndView("mobileList","mobile",list);
	}
	
	@PostMapping("/save")
	public String addMobile(@ModelAttribute Mobile m) {
		service.save(m);
		return "redirect:/available_mobiles";
	}
	@GetMapping("/my_mobiles")
	public String getMyMobiles(Model model)
	{
		List<MobileList>list=mobileListService.getAllMyMobiles();
		model.addAttribute("mobile",list);
		return "myMobiles";
	}
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id){
		Mobile b=service.getMobileById(id);
		MobileList mb=new MobileList(b.getId(),b.getName(),b.getBrand(),b.getPrice(),b.getQuantity());
		mobileListService.saveMyMobile(mb);
		return "redirect:/my_mobiles";
	}
	
	@RequestMapping("/edit_Mobile/{id}")
	public String editMobile(@PathVariable("id") int id,Model model) {
		Mobile b=service.getMobileById(id);
		model.addAttribute("mobile",b);
		return "mobileEdit";
	}
	@RequestMapping("/deleteMobile/{id}")
	public String deleteMobile(@PathVariable("id")int id){
		service.deleteById(id);
		return "redirect:/available_mobiles";
	}
}
