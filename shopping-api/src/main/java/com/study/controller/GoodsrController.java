package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.entity.Goods;
import com.study.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsrController {
    @Autowired
    private GoodsService goodsService;
    @ResponseBody
    @GetMapping("/getGoods")
    public List<Goods> getGoods() {
        return  goodsService.getGoods();
    }
    @ResponseBody
    @GetMapping("findPageAll")
    public PageInfo<Goods> findPageAll(@RequestParam(defaultValue="1")int page, @RequestParam(defaultValue="7") int pageSize){
        return  goodsService.findPageAll(page,pageSize);
    }
    @ResponseBody
    @GetMapping("/getGoodsById")
    public Goods getGoodsById(Integer id) {
        return  goodsService.getGoodsById(id);
    }


}
