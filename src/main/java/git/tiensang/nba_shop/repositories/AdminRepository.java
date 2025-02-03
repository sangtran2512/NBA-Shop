package git.tiensang.nba_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import git.tiensang.nba_shop.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Phuong thuc
}