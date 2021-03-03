package com.study.service;

import com.study.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddress();
    Address getAddressById(Integer id);
    List<Address> getAddressByUid(Integer id);
    void addAddress(Address address);
    void updateAddress(Address address);
}
