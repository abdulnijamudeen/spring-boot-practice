package com.nizam.springbootpractice.controller;

import java.util.List;

import com.nizam.springbootpractice.entity.Address;
import com.nizam.springbootpractice.handler.RestException;
import com.nizam.springbootpractice.service.address.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
    public ResponseEntity<List<Address>> getAll() {
        log.info("Address Controller - getAll");
        List<Address> addresses = addressService.allAddresses();
        return ResponseEntity.ok(addresses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Long id) throws RestException {
        log.info("Address Controller - getAddress");
        Address address = addressService.getAddressById(id);
        return ResponseEntity.ok(address);
    }
}
