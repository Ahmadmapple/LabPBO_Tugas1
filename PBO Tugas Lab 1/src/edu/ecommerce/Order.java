package edu.ecommerce;

public class Order {
    int orderId;
    String customerName;
    double total;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public class OrderItem {
        String productName;
        int price, quantity;

        public OrderItem(String productName, int price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        double getSubtotal() {
            return price * quantity;
        }

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public double hitungTotal(OrderItem[] items) {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("ID Pesanan      : " + orderId);
        System.out.println("Nama Pelanggan  : " + customerName);
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s %-10s %-5s %-10s\n", "Produk", "Harga", "Qty", "Subtotal");

        for (OrderItem item : items) {
            System.out.printf("%-15s %-10d %-5d %-10.2f\n",
                    item.getProductName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getSubtotal());
        }

        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL PEMBAYARAN: %.2f\n", hitungTotal(items));
    }
}