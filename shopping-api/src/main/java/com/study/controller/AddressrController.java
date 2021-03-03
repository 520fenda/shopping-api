package com.study.controller;

import com.study.entity.Address;
import com.study.service.AddressService;
import com.study.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressrController {

    @Autowired
    private AddressService addressService;
    @ResponseBody
    @RequestMapping("/getAddress")
    public List<Address> getAddress() {
        return  addressService.getAddress();
    }
    @ResponseBody
    @GetMapping("/getAddressById")
    public Address getAddressById(Integer id){
        return addressService.getAddressById(id);
    }

    @ResponseBody
    @GetMapping("/getAddressByUid")
    public List<Address> getAddressByUid(Integer uid){
        return addressService.getAddressByUid(uid);
    }

    @PostMapping("/addAddress")
    public ResponseUtil addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return ResponseUtil.successMsg("保存地址成功");
    }

    @PostMapping("/updateAddress")
    public ResponseUtil updateAddress(@RequestBody Address address){
        addressService.updateAddress(address);
        return ResponseUtil.successMsg("更新地址成功");

    }


}
