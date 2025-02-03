package git.tiensang.nba_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import git.tiensang.nba_shop.models.Team;
import git.tiensang.nba_shop.services.TeamService;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    //API de lay tat ca Team
    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
}
