package com.example.productcatalog.ProductService;

import com.example.productcatalog.ProductEntity.ProductEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private List<ProductEntity> productList = new ArrayList<>();

    // Constructor: inicializamos algunos productos de ejemplo
    public ProductService() {
        productList.add(new ProductEntity("Laptop", "Electrónica", 1000.00, 50));
        productList.add(new ProductEntity("Silla", "Muebles", 150.00, 30));
        productList.add(new ProductEntity("Cámara", "Fotografía", 500.00, 15));
    }

    // Obtener todos los productos
    public List<ProductEntity> getAllProducts() {
        return productList;
    }

    // Obtener un producto por UUID
    public Optional<ProductEntity> getProductById(UUID id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    // Agregar un nuevo producto
    public ProductEntity addProduct(ProductEntity product) {
        productList.add(product);
        return product;
    }

    // Actualizar un producto
    public Optional<ProductEntity> updateProduct(UUID id, ProductEntity updatedProduct) {
        Optional<ProductEntity> existingProduct = getProductById(id);
        if (existingProduct.isPresent()) {
            ProductEntity product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setCategory(updatedProduct.getCategory());
            product.setPrice(updatedProduct.getPrice());
            product.setStock(updatedProduct.getStock());
        }
        return existingProduct;
    }

    // Eliminar un producto
    public boolean deleteProduct(UUID id) {
        return productList.removeIf(product -> product.getId().equals(id));
    }
}
