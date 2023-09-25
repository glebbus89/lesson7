package builder;

public class Program {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("AAA");
        String s = stringBuilder
                .append("BB")
                .append("CCC")
                .insert(2,"DDD")
                .append("EEEE")
                .toString();

        Order order = new OrderBuilder()
                .setProductId(10012)
                .setProductName("AAAAAA")
                .setQnt(2)
                .setPrice(100.15)
                .setClientName("BBBBB")
                .build();
    }
}
