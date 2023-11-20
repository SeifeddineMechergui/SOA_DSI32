package com.dev.Billingservice.Repositories;

import com.dev.Billingservice.Entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
    List<ProductItem> findAllById(Long billId);
    Collection<ProductItem> findByBillId(Long id);
}