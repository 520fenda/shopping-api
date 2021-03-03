package com.study.dao;

import com.study.entity.Address;

import java.util.List;

public interface AddressDao {
    List<Address> getAddress();
   Address getAddressById(Integer id);
   List<Address> getAddressByUid(Integer id);
   void addAddress(Address address);
   void updateAddress(Address address);


}
