package designPatterns.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private final long isin;
    private final String name;
    private final LocalDate manufacturedDate;
    private final LocalDate expiryDate;


    private Product(Builder builder) {
        this.isin = builder.isin;
        this.name = builder.name;
        this.manufacturedDate = builder.manufacturedDate;
        this.expiryDate = builder.expiryDate;
    }

    public long getIsin() {
        return isin;
    }

    public String getName() {
        return name;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
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

    public static final class Builder {
        private long isin;
        private String name;
        private LocalDate manufacturedDate;
        private LocalDate expiryDate;

        public Builder isin(long isin) {
            this.isin = isin;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder manufacturedDate(LocalDate manufacturedDate) {
            this.manufacturedDate = manufacturedDate;
            return this;
        }

        public Builder expiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
