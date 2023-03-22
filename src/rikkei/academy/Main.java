package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(1, "Laptop Dell", 20000000));
        productManager.addProduct(new Product(2, "Smartphone Samsung", 10000000));
        productManager.addProduct(new Product(3, "Tivi Sony", 15000000));
        productManager.addProduct(new Product(4, "Máy lạnh Daikin", 30000000));

        // Hiển thị tất cả sản phẩm
        productManager.displayAllProducts();

        // Cập nhật sản phẩm
        productManager.updateProduct(2, "Smartphone iPhone", 15000000);
        productManager.displayAllProducts();

        // Xóa sản phẩm
        productManager.deleteProduct(3);
        productManager.displayAllProducts();

        // Tìm kiếm sản phẩm theo tên
        productManager.searchProductByName("Laptop Dell");

        // Sắp xếp sản phẩm theo giá (tăng dần)
        productManager.sortProductsByPriceAscending();

        // Sắp xếp sản phẩm theo giá (giảm dần)
        productManager.sortProductsByPriceDescending();
    }
}