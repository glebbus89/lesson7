package builder;

public class OrderBuilder {

    private Order order;

    public OrderBuilder() {

        order = new Order();
    }

    public Order  build(){

        if (order.getQnt() <=0){
            throw new RuntimeException("Кол-во позиций товара указано некорректно!");
        }

        if (order.getPrice() <=0){
            throw new RuntimeException("Цена товара указана некорректно!");
        }

        return order;
    }

    public OrderBuilder setClientName(String clientName) {
        order.setClientName(clientName);
        return this;
    }

    public OrderBuilder setCompanyName(String companyName) {
        order.setClientName(companyName);
        return this;
    }

    public OrderBuilder setProductId(int productId) {
        order.setProductId(productId);
        return this;
    }
    public OrderBuilder setProductName(String productName) {
        order.setProductName(productName);
        return this;
    }
    public OrderBuilder setPrice(double price) {
        order.setPrice(price);
        return this;
    }
    public OrderBuilder setSign(boolean sign) {
        order.setSign(sign);
        return this;
    }

    public OrderBuilder setQnt(int Qnt) {
        order.setQnt(Qnt);
        return this;
    }

}
