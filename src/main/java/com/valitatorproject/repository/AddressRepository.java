package com.valitatorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valitatorproject.entity.UserAddress;

public interface AddressRepository extends JpaRepository<UserAddress, Long>{

}
