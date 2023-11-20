package com.dev.Billingservice.Repositories;

import com.dev.Billingservice.Entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}