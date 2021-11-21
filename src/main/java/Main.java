import entites.Product;
import repositories.ProductDao;
import repositories.ProductDaoRepository;
import sessions.SessionFactoryUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactoryUtils utils = new SessionFactoryUtils();
        utils.init();
        ProductDao repository = new ProductDaoRepository(utils);

        List<Product> productList = repository.findAll();
        System.out.println(productList);

        repository.deleteById(1L);
        productList = repository.findAll();
        System.out.println(productList);

        repository.saveOrUpdate(new Product("Milk", 60));
        productList = repository.findAll();
        System.out.println(productList);

        Product p = repository.findById(2L);
        System.out.println(p);

        utils.shutdown();
    }
}
