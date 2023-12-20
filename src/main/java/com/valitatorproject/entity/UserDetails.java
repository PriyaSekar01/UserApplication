package com.valitatorproject.entity;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="userdetails")
public class UserDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String userName;
	
	@Column(name="email")
	private String emailNumber;
	
	@Column(name="number")
	private Long userNumber;
	
	@Column(name="password")
	private String passWord;
	
		
	@OneToOne(targetEntity = UserAddress.class,cascade = {CascadeType.ALL})
	@JoinColumn(name = "address_id",referencedColumnName = "address_id")
	private UserAddress address;

}
