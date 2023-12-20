package com.valitatorproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.valitatorproject.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{
	
	 
//	@Query("SELECT U.userName,U.emailNumber,U.userNumber,U.passWord"
//			+"A.userState ,A.userDistrict,A.userPincode,A.userCity"
//			+"From UserDetails U INNER JOIN U.address A"
//			+"WHERE U.userName=:key OR U.emailNumber:=key OR U.userNumber:=key OR U.passWord:=key OR U.id:=key"
//			+"A.userState:=key OR A.userDistrict:=key OR A.userPincode:=key OR A.userCity:=key OR A.id:=key")
//	List<Object> findAny(@Param ("key") Object key);
	
	
	@Query(value="\r\n"
			+"select * from userdetails u inner join user_address a on u.id = u.address_id where u.name like %:key% or u.email like %:key% or u.number like %:key% or  u.password like %:key% or u.id like %:key% \r\n"
	         +"or a.address_id like %:key% or a.state like %:key% or a.district like %:key% or a.pincode like %:key% or a.City like %:key% " ,nativeQuery=true)
	List<Object> findAny(@Param ("key") Object key);


}
