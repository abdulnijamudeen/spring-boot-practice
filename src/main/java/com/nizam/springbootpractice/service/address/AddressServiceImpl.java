package com.nizam.springbootpractice.service.address;

import java.util.List;

import javax.transaction.Transactional;

import com.nizam.springbootpractice.entity.Address;
import com.nizam.springbootpractice.handler.RestException;
import com.nizam.springbootpractice.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> allAddresses() {
        log.info("Get all addresss");
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) throws RestException {
        log.info("Get address by id");
        return addressRepository.findById(id)
                .orElseThrow(() -> new RestException("Address not found with id : " + id, HttpStatus.NOT_FOUND));
    }

}
