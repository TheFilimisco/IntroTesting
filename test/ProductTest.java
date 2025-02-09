import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void product(){
        var producto = new Product("yummy",100, 10);
        assertEquals(100, producto.getPrice());
        assertEquals(10, producto.getStock());
        assertEquals("yummy", producto.getName());
    }

    @Test
    void setPrice() {
        var producto = new Product("Pc", 100, 20);
        var prodcuto2 = new Product("Pc2", 110, 30);
        producto.setPrice(110);
        prodcuto2.setPrice(-20); // This doesn't change
        assertEquals(110, producto.getPrice());
        assertEquals(110, producto.getPrice());
    }

    @Test
    void restock() {
        var producto = new Product("Mouse Gaming", 20, 10);
        producto.restock(1);
        assertEquals(11, producto.getStock());
    }

    @Test
    void sell() {
        var producto = new Product("Mouse Gaming", 20, 10);
        producto.sell(1);
        assertEquals(9, producto.getStock());
    }
    @Test
    public void testConstructorInitializesAttributes() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertEquals("Laptop", product.getName());
        assertEquals(1200.0, product.getPrice());
        assertEquals(10, product.getStock());
    }
    @Test
    public void testSetPriceChangesPriceWhenPositive() {
        Product product = new Product("Laptop", 1200.0, 10);
        product.setPrice(1500.0);
        assertEquals(1500.0, product.getPrice());
    }
    @Test
    public void testSetPriceDoesNotChangePriceWhenNegative() {
        Product product = new Product("Laptop", 1200.0, 10);
        product.setPrice(-500.0);
        assertEquals(1200.0, product.getPrice());
    }
    @Test
    public void testRestockIncreasesStockWhenPositive() {
        Product product = new Product("Laptop", 1200.0, 10);
        product.restock(5);
        assertEquals(15, product.getStock());
    }
    @Test
    public void testSellDecreasesStockWhenEnoughStock() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertTrue(product.sell(5)); //verified if this is possible
        assertEquals(5, product.getStock());
    }
    @Test
    public void testSellFailsWhenNotEnoughStock() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertFalse(product.sell(15));
        assertEquals(10, product.getStock());
    }
    @Test
    public void testSellFailsWhenNegativeQuantity() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertFalse(product.sell(-3));
        assertEquals(10, product.getStock());
    }

}