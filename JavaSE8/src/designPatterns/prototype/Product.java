package designPatterns.prototype;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    long isin;
    String name;
    LocalDate manufacturedDate;
    LocalDate expiryDate;

    public Product(long isin, String name, LocalDate manufacturedDate, LocalDate expiryDate) {
        this.isin = isin;
        this.name = name;
        this.manufacturedDate = manufacturedDate;
        this.expiryDate = expiryDate;
    }

    private Product(Product currentProduct) {
        this.isin = currentProduct.isin;
        this.name = currentProduct.name;
        this.manufacturedDate = currentProduct.manufacturedDate;
        this.expiryDate = currentProduct.expiryDate;
    }

    public long getIsin() {
        return isin;
    }

    public void setIsin(long isin) {
        this.isin = isin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return isin == product.isin && Objects.equals(name, product.name) && Objects.equals(manufacturedDate, product.manufacturedDate) && Objects.equals(expiryDate, product.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isin, name, manufacturedDate, expiryDate);
    }

    @Override
    public String toString() {
        return "Product{" +
                "isin=" + isin +
                ", name='" + name + '\'' +
                ", manufacturedDate=" + manufacturedDate +
                ", expiryDate=" + expiryDate +
                '}';
    }


    public Object duplicate() {
        return new Product(this);
    }
}
