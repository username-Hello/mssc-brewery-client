package com.breweryclient.web.client;

import com.breweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerClientTest {

    @Autowired
    BeerClient beerClient;

    @Test
    void getBeerById() {
        BeerDto beerDto = beerClient.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }
}