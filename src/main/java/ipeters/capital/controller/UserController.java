package ipeters.capital.controller;

import ipeters.capital.model.User;
import ipeters.capital.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/* carlpeters created on 19/02/2025 inside the package - ipeters.capital.controller */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String displayUsers(Model model) {
        log.info("findAll() method called");
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/list-users";
    }

    @PostMapping("/save")
    public String createUser(User user, Model model) {
        userService.save(user);
        return "redirect:/user/new";
    }

    @GetMapping("/new")
    public String displayUserForm(Model model) {
        User aUser = new User();
        model.addAttribute("user", aUser);
        log.info("getmapping new user");
        return "user/new-user";
    }
}
