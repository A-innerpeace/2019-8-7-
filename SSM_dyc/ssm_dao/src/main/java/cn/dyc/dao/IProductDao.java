package cn.dyc.dao;

import cn.dyc.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductDao {
    @Select("select * from product")
    List<Product> findAll() throws Exception;

}
