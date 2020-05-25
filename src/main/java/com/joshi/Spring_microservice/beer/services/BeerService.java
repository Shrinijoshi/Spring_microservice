package com.joshi.Spring_microservice.beer.services;

import com.joshi.Spring_microservice.beer.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
