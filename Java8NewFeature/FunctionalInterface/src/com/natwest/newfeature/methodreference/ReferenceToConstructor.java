package com.natwest.newfeature.methodreference;


@FunctionalInterface
interface ProductDetails{

    Product display(String name);

}
class Product
{
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




public class ReferenceToConstructor {

    public static void main(String[] args) {

        ProductDetails productDetails = Product::new;

        Product prod = productDetails.display("laptop");
        System.out.println(prod.getName());

    }
}
