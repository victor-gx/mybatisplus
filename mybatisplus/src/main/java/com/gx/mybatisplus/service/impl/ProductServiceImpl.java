package com.gx.mybatisplus.service.impl;

import com.gx.mybatisplus.mapper.ProductMapper;
import com.gx.mybatisplus.pojo.Product;
import com.gx.mybatisplus.service.ProductService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
