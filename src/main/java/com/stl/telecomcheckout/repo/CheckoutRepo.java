package com.stl.telecomcheckout.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.telecomcheckout.entity.Checkout;

public interface CheckoutRepo extends JpaRepository<Checkout, Long>{

}
