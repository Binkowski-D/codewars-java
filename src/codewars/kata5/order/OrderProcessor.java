package codewars.kata5.order;

public class OrderProcessor {
    private final InventoryService inventoryService;

    public OrderProcessor(InventoryService inventoryService){
        if (inventoryService == null) {
            throw new IllegalArgumentException("InventoryService cannot be null");
        }
        this.inventoryService = inventoryService;
    }

    public boolean processOrder(Order order){
        String productName = order.getProductName();
        int quantity = order.getQuantity();

        if(!inventoryService.isProductAvailable(productName, quantity)){
            return false;
        }

        inventoryService.updateStock(productName, quantity);
        return true;
    }
}

class Order{
    private String productName;
    private int quantity;

    public Order(String productName, int quantity){
        if (productName == null || productName.isBlank() || quantity <= 0) {
            throw new IllegalArgumentException("Invalid order data");
        }

        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName(){
        return productName;
    }

    public int getQuantity(){
        return quantity;
    }
}
