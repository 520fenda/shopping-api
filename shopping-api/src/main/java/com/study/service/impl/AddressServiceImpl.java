package com.study.service.impl;

import com.study.dao.AddressDao;
import com.study.entity.Address;
import com.study.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;
    @Override
    public List<Address> getAddress() {
        return addressDao.getAddress();
    }

    @Override
    public Address getAddressById(Integer id) {
        return addressDao.getAddressById(id);
    }

    @Override
    public List<Address> getAddressByUid(Integer id) {
        return addressDao.getAddressByUid(id);
    }

    @Override
    public void addAddress(Address address) {
        addressDao.addAddress(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressDao.updateAddress(address);
    }

}
