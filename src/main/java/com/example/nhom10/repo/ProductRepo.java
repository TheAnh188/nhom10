package com.example.nhom10.repo;
import com.example.nhom10.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> { }
