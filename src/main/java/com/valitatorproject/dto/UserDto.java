package com.valitatorproject.dto;



import com.valitatorproject.entity.UserAddress;

import lombok.Data;

@Data
public class UserDto {
	
	private Long id;
	
	private String userName;
	
	private String emailNumber;
	
	private Long userNumber;
	
	private String passWord;
	
	
	private UserAddress address;

}
