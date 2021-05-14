package com.nizam.springbootpractice.service.address;

import java.util.List;

import com.nizam.springbootpractice.entity.Address;
import com.nizam.springbootpractice.handler.RestException;

public interface AddressService {
    List<Address> allAddresses();
    Address getAddressById(Long id) throws RestException;
}
