public class Product {
    private String name;
    private double price;
    private int stock;
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    public void restock(int quantity) {
        if (quantity > 0) {
            this.stock += quantity;
        }
    }
    public boolean sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

}
