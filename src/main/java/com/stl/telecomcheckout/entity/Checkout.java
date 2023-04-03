package com.stl.telecomcheckout.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="checkout")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Checkout {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String cardNumber;
	private String cardMon;
	private String cardYr;
	private String cardAmt;
}
