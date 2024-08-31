package factory.method.idcard;

import factory.method.framework.Factory;
import factory.method.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("register " + product);
    }

}