
package git.tiensang.nba_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import git.tiensang.nba_shop.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Phuong thuc
}