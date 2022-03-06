package uaslp.objetos.parcial1.examen.pos;

public class CartItem {
    private int quantity;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public String getProductName(){
        return product.getName();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getAmount(){
        return product.getAmount();
    }
}

