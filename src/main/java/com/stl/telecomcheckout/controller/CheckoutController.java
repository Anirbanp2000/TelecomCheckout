package com.stl.telecomcheckout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stl.telecomcheckout.entity.Checkout;
import com.stl.telecomcheckout.repo.CheckoutRepo;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class CheckoutController {

	@Autowired
	private CheckoutRepo checkoutRepo;
	
	@GetMapping("/allDetails")
	public ResponseEntity<List<Checkout>> getAllDetails(){
		List<Checkout> check=checkoutRepo.findAll();
		return ResponseEntity.ok(check);
	}
	
	@PostMapping("/pay")
	public ResponseEntity<Checkout> addPlan(@RequestBody Checkout checkout) {
		checkoutRepo.save(checkout);
		return ResponseEntity.ok(checkout);
}
}
