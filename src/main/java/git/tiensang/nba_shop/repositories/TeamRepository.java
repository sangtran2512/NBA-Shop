package git.tiensang.nba_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import git.tiensang.nba_shop.models.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // Phuong thuc
}