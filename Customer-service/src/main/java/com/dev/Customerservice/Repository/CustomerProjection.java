package com.dev.Customerservice.Repository;

import com.dev.Customerservice.Entity.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer",types = Customer.class)
public interface CustomerProjection extends Projection {
    public Long getId();
    public String getName();
    public String getEmail();
}