package git.tiensang.nba_shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import git.tiensang.nba_shop.models.Team;
import git.tiensang.nba_shop.repositories.TeamRepository;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();  //Lay tat ca doi bong trong db
    }
}
