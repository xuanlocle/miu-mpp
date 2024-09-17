package prob2;

public class Product {
    final String title;
    final double price;
    final int model;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Product e = (Product) obj;
        return e.getTitle().equals(title) && e.getPrice() == price && e.getModel() == model;
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

}
