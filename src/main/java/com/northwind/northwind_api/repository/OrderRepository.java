package com.northwind.northwind_api.repository;

import com.northwind.northwind_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> getByCustomerId(Integer customerId);
    List<Order> getByEmployeeId(Integer employeeId);
}
