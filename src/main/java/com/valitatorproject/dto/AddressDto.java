package com.valitatorproject.dto;

import lombok.Data;

@Data
public class AddressDto {
	
	private Long id;
	
	private String userState;
	
	private String userDistrict;
	
	private int userPincode;
	
	private String userCity;

}
