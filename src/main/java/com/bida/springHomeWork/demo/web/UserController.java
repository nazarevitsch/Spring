package com.bida.springHomeWork.demo.web;

import com.bida.springHomeWork.demo.domain.Product;
import com.bida.springHomeWork.demo.domain.User;
import com.bida.springHomeWork.demo.domain.UserRole;
import com.bida.springHomeWork.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User user(){return new User();}

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAllUsers());
        return "user";
    }

    @PostMapping("/users")
    public String addNewUser(@ModelAttribute("user") User user){
        System.out.println(user);
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/add_user")
    public String createUserPage(Model model){
        model.addAttribute("roles", UserRole.values());
        return "add-user";
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Long> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
