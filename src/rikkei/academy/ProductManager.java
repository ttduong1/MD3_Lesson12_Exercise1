package rikkei.academy;

import java.util.LinkedList;


public class ProductManager {
    private LinkedList<Product> products;

    public ProductManager() {
        this.products = new LinkedList<Product>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void updateProduct(int id, String name, double price) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
                break;
            }
        }
    }

    public void deleteProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                break;
            }
        }
    }

    public void displayAllProducts() {
        System.out.println("List of all products:");
        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
        }
    }

    public void searchProductByName(String name) {
        System.out.println("Search results for product name '" + name + "':");
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
            }
        }
    }

    public void sortProductsByPriceAscending() {
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("List of products sorted by price (ascending):");
        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
        }
    }

    public void sortProductsByPriceDescending() {
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("List of products sorted by price (descending):");
        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
        }
    }
}
