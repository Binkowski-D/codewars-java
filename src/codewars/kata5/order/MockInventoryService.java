package codewars.kata5.order;

import java.util.HashMap;
import java.util.Map;

public class MockInventoryService implements InventoryService {

    private Map<String, Integer> stock = new HashMap<>();

    @Override
    public boolean isProductAvailable(String productName, int quantity) {
        Integer stockQuantity = stock.get(productName);
        return stockQuantity != null && stockQuantity >= quantity;
    }

    @Override
    public void updateStock(String productName, int quantity) {
        if(isProductAvailable(productName, quantity)){
            int newQuantity = stock.get(productName) - quantity;
            stock.put(productName, Math.max(newQuantity, 0));
        }
    }

    // Additional method for testing only
    public void addStock(String productName, int quantity){
        stock.merge(productName, quantity, Integer::sum);
    }
}
