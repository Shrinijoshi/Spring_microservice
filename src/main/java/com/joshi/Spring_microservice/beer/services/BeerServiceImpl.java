package com.joshi.Spring_microservice.beer.services;

import com.joshi.Spring_microservice.beer.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Yale")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
    log.debug("updating .....");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting ...........");
    }
}
