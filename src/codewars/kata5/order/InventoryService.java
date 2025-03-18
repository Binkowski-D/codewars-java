package codewars.kata5.order;

public interface InventoryService {

    boolean isProductAvailable(String productName, int quantity);
    void updateStock(String productName, int quantity);
}
