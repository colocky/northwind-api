package com.northwind.northwind_api.service;

import com.northwind.northwind_api.model.Order;
import com.northwind.northwind_api.repository.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Integer orderId) {
        return orderRepository.findById(orderId);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public ResponseEntity<Order> updateOrder(Integer orderId, Order order) {
        if (!orderRepository.existsById(orderId)) {
            return ResponseEntity.notFound().build();
        }
        order.setOrderId(orderId);
        Order updated = orderRepository.save(order);
        return ResponseEntity.ok(updated);
    }

    public boolean deleteOrder(Integer orderId) {
        if(orderRepository.existsById(orderId)) {
            orderRepository.deleteById(orderId);
            return true;
        }
        return false;
    }

    public List<Order> getAllOrdersByCustomerId(Integer customerId) {
        return orderRepository.getByCustomerId(customerId);
    }

    public List<Order> getAllOrdersByEmployeeId(Integer employeeId) {
        return orderRepository.getByEmployeeId(employeeId);
    }

}
