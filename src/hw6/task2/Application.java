package hw6.task2;

import hw6.task2.objects.Product;
import hw6.task2.objects.MyProduct;

public class Application {
    public static void main(String[] args) {

        Product product1 = new Product("Яблоко", 2, 5, 30, 100);
        Product product2 = new Product("Салат", 25, 40, 37, 127);
        Product product3 = new Product("Пицца", 16, 29, 90, 523);
        Product product4 = new Product("Кока-Кола", 2, 9, 11, 67);
        Product product5 = new Product("Мороженое", 4, 9, 10, 112);

        MyProduct ration1 = new MyProduct("Обед");
        ration1.addProduct(product1, product2, product3, product4);
        ration1.productsList();
    }
}
