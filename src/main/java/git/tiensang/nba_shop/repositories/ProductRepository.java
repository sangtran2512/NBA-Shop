package git.tiensang.nba_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import git.tiensang.nba_shop.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Phuong thuc
}