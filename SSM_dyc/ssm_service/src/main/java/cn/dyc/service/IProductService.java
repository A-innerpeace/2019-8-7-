package cn.dyc.service;

import cn.dyc.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}
