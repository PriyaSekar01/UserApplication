package com.valitatorproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valitatorproject.dto.UserDto;
import com.valitatorproject.entity.UserDetails;
import com.valitatorproject.service.UserService;

@RestController
@RequestMapping("/userdetails")
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@PostMapping("/create")
	public UserDetails create(@RequestBody UserDto userdto) {
		return service.create(userdto);
	}
	
	@PostMapping("/listOfPost")
	public List<UserDetails> listOfPost(@RequestBody List<UserDto> dto){
		return service.listOfPost(dto);
		
	}
	
	@GetMapping("/getKey")
	public List<Object> getAny(@RequestParam ("key") Object key){
	   return service.getAny(key);
   }
}
