package com.softuni.coffeeshop.service;

import com.softuni.coffeeshop.model.service.OrderServiceModel;
import com.softuni.coffeeshop.model.view.OrderViewModel;

import java.util.List;

public interface OrderService {
    void addOrder(OrderServiceModel orderServiceModel);

    List<OrderViewModel> findAllOrderOrderByPriceDesc();

    void readyOrder(Long id);

}
