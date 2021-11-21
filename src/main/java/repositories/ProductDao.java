package repositories;

import entites.Product;

import java.util.List;

public interface ProductDao {
    Product findById(Long id);
    void deleteById(Long id);
    List<Product> findAll();
    void saveOrUpdate(Product product);
}
