package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.mоdelUser.User;
import web.service.UserService;

@Controller
public class UsersController {

    private final UserService userService;
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = {"/add"})
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.createUser(user);
        return "pagesUser/addUser";
    }

//    @GetMapping("/")
//    public String allUsers(Model model) {
//        model.addAttribute("users",userService.getAllUsers());
//        return "pagesUser/allUsers";
//    }
//    @GetMapping("/{id}")
//    public String getUserById(@PathVariable("id") int id,Model model) {
//        model.addAttribute("user",userService.getUser(id));
//        return "pagesUser/userById";
//    }
//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable(name = "id") int id) {
//        User user = userService.readUserById(id);
//        userService.removeUser(id);
//        return "redirect:/";
//    }
}
