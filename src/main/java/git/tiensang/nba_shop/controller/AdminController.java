package git.tiensang.nba_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import git.tiensang.nba_shop.models.Admin;
import git.tiensang.nba_shop.services.AdminService;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    // API de lay admins
    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }
}
