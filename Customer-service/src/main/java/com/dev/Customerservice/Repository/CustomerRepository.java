package com.dev.Customerservice.Repository;

import com.dev.Customerservice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}