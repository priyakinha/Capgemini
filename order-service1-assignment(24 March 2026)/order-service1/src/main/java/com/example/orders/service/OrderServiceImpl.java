package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderrepo;

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        OrderEntity o=orderrepo.save(OrderMapper.toEntity(request));
        return o;

    }

    @Override
    public OrderEntity getOrderById(Long id) {
        Optional<OrderEntity> op=orderrepo.findById(id);
        if(op.isPresent()){
            return op.get();
        }else{
            throw new OrderNotFoundException();
        }
    }

    @Override
    public void deleteOrder(Long id) {
        if(!orderrepo.existsById(id)){
            throw new OrderNotFoundException();
        }
        orderrepo.deleteById(id);
    }
}
