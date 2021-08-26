package com.breweryclient.web.client;

import com.breweryclient.web.model.BeerDto;
import com.breweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById() {
        BeerDto beerDto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }

    @Test
    void saveNewBeer() {
        BeerDto beerDto = new BeerDto();
        URI uri = breweryClient.saveNewBeer(beerDto);
        assertNotNull(uri);
        System.out.println(uri);
    }

    @Test
    void updateBeer() {
        BeerDto beerDto = BeerDto.builder().build();
        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void deleteBeer() {
        breweryClient.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
        CustomerDto customerDto = breweryClient.getCustomerById(UUID.randomUUID());
        assertNotNull(customerDto);
    }

    @Test
    void saveNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder().build();
        URI uri = breweryClient.saveNewCustomer(customerDto);
        assertNotNull(uri);
    }

    @Test
    void updateCustomerById() {
        CustomerDto customerDto = CustomerDto.builder().build();
        breweryClient.updateCustomerById(UUID.randomUUID(), customerDto);
    }

    @Test
    void deleteCustomer() {
        breweryClient.deleteCustomer(UUID.randomUUID());
    }
}