package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.mоdelUser.User;
import web.service.UserService;

@Controller
public class UsersController {
    @Autowired
    private UserService userService;
    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = {"/add"})
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.createUser(user);
        return "addUser";
    }

    @GetMapping
    public String allUsers(Model model) {
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") int id,Model model) {
        model.addAttribute("user",userService.getUser(id));
        return "userById";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable(name = "id") int id) {
        User user = userService.readUserById(id);
        userService.removeUser(id);
        return "redirect:/";
    }
}
