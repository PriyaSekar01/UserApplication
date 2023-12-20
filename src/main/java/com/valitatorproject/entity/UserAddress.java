package com.valitatorproject.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="user_address")
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="address_id")
	private Long id;
	
	@Column(name="state")
	private String userState;
	
	@Column(name="district")
	private String  userDistrict;
	
	@Column(name="pincode")
	private int userPincode;
	
	
	@Column(name="city")
	private String  userCity;
	
}


