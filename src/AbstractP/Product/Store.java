package AbstractP.Product;


import java.util.ArrayList;
import java.util.List;


record OrderItem(int quantity, ProductForSale productForSale) {

}


public class Store {
    private static List<ProductForSale> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        listProduct.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        listProduct.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        listProduct.add(new Furniture("Desk", 500, "Mahogany Desk"));
        listProduct.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));

        for (ProductForSale p : listProduct) {
            displayProduct(p);
        }
//        List<OrderItem> orderList=new ArrayList<>();
//        addOrder(orderList,new ArtObject("Oip",12.22,"des"),5);
//        addOrder(orderList,new ArtObject("Bucket",15.66,"des"),6);
//        printOrderList(orderList);

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addOrder(order1, 1, 2);
        addOrder(order1, 0, 1);
        printOrderList(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addOrder(order2, 3, 5);
        addOrder(order2, 0, 1);
        addOrder(order2, 2, 1);

        printOrderList(order2);


    }

    public static void displayProduct(ProductForSale productForSale) {
        System.out.println("-".repeat(30));
        productForSale.showDetails();
    }

    public static void addOrder(List<OrderItem> orderItems, int orderIndex, int quantity) {
        orderItems.add(new OrderItem(quantity, listProduct.get(orderIndex)));
    }

    public static void printOrderList(List<OrderItem> orderItems) {
        double salesTotal = 0;
        for (OrderItem o : orderItems) {
            o.productForSale().printPricedLineItem(o.quantity());
            salesTotal += o.productForSale().getSalesPrice(o.quantity());
        }
        System.out.printf("Sales Total= $%6.2f %n", salesTotal);
    }


}
