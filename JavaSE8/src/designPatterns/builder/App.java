package designPatterns.builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("App");
        Product emptyProduct = new Product.Builder().build();
        System.out.println(emptyProduct);
        Product product = new Product.Builder()
                .isin(4L)
                .name("P4")
                .manufacturedDate(LocalDate.of(2020, 12, 12))
                .expiryDate(LocalDate.of(2022, 12, 11))
                .build();
        System.out.println(product);
        Product product1 = new Product.Builder()
                .isin(5L)
                .name("P5")
                .manufacturedDate(LocalDate.of(2020, 12, 12))
                .build();
        System.out.println(product1);
        Product product3 = new Product.Builder()
                .isin(6L)
                .name("P6")
                .build();
        System.out.println(product3);
    }
}
