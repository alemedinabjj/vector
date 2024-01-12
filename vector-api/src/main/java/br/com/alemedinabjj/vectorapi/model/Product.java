package br.com.alemedinabjj.vectorapi.model;

import java.util.UUID;

public class Product {
    private UUID cod;
    private String description;
    private Double price;

    public Product(UUID cod, String description, Double price) {
        this.cod = cod;
        this.description = description;
        this.price = price;
    }

    public UUID getCod() {
        return cod;
    }

    public void setCod(UUID cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean hasError() {
        if (this.description.isBlank() || this.description.isEmpty())
            return false;

        return !this.price.isNaN() && this.price <= 0;
    }

    @Override
    public String toString() {
        return "{" +
                "cod=" + cod +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
