package factory.method.idcard;

import factory.method.framework.Product;

public  class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("create " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use " + this.owner);
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }

}