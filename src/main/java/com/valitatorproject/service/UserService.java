package com.valitatorproject.service;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valitatorproject.dto.UserDto;

import com.valitatorproject.entity.UserDetails;

import com.valitatorproject.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	
	
	public UserDetails create(UserDto userdto) {
		UserDetails user = new UserDetails();
		user.setUserName(userdto.getUserName());
		user.setEmailNumber(userdto.getEmailNumber());
		user.setUserNumber(userdto.getUserNumber());
		user.setPassWord(userdto.getPassWord());
		user.setAddress(userdto.getAddress());
		return repository.save(user);
	}
	
	
	public List<UserDetails> listOfPost(List<UserDto> userDto){
		List<UserDetails> userList = new ArrayList<>();
		for(UserDto dto:userDto) {
			UserDetails userObj=new UserDetails();
			userObj.setUserName(dto.getUserName());
			userObj.setEmailNumber(dto.getEmailNumber());
			userObj.setUserNumber(dto.getUserNumber());
			userObj.setAddress(dto.getAddress());
			userList.add(userObj);
			
			}
		return repository.saveAll(userList);
	}
	
	public List<Object> getAny(Object key){
		return repository.findAny(key);
	}
	
	

	
	

}
