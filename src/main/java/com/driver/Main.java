package com.driver;

public class Main {
    public static class Product{
        public void product(int x, int y){

        }
        public void product(int x, int y, int z){

        }
        public void product(double x, double y) {

        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(2, 5);
        p.product(2, 5, 8);
        p.product(2.5, 5.6);

    }
}