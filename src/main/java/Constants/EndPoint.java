package Constants;

public enum EndPoint {
    STORE("/store/"),
    CART("/cart/"),
    CHECKOUT("/checkout/"),
    ORDER_RECEIVED("/order-received/");

    public final String path;

    EndPoint(String path) {
        this.path = path;
    }



}
