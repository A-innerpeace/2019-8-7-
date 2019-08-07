package cn.dyc.service;

import cn.dyc.dao.IProductDao;
import cn.dyc.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        System.out.println("Service 执行了");
        return productDao.findAll();
    }
}
