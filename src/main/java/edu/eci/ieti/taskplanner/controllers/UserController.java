package edu.eci.ieti.taskplanner.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.ieti.taskplanner.model.User;
import edu.eci.ieti.taskplanner.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
// @RequestMapping(value = "/taskApp/v1")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable String id){
        return userService.getById(id);
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    
    @PostMapping("/users/{id}")
    public User create(@RequestBody User user, @PathVariable String id) {
        return userService.update(user);
    }

    @DeleteMapping("/users/{id}")
    public void remove(@PathVariable String id) {
        userService.remove(id);
    }
}
