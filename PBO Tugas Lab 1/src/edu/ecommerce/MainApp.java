package edu.ecommerce;

public class MainApp {
    public static void main(String[] args){
        Order firstOrder = new Order(101, "Michael");
        Order.OrderItem i1 = firstOrder.new OrderItem("Buku", 5000, 2);
        Order.OrderItem i2 = firstOrder.new OrderItem("Pena", 2000, 5);
        Order.OrderItem i3 = firstOrder.new OrderItem("Pensil", 1500, 3);

        Order.OrderItem[] itemsMichael = {i1, i2, i3};

        Order secondOrder = new Order(102, "Caesar");
        Order.OrderItem j1 = secondOrder.new OrderItem("Kertas A4", 50000, 1);
        Order.OrderItem j2 = secondOrder.new OrderItem("Tinta Printer", 85000, 2);
        Order.OrderItem j3 = secondOrder.new OrderItem("Penggaris", 5000, 1);

        Order.OrderItem[] itemsCaesar = {j1, j2, j3};

        System.out.println("--- NOTA PEMBAYARAN 1 ---");
        firstOrder.tampilkanRincian(itemsMichael);

        System.out.println("\n");

        System.out.println("--- NOTA PEMBAYARAN 2 ---");
        secondOrder.tampilkanRincian(itemsCaesar);
    }
}