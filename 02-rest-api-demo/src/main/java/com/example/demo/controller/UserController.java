package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers(){
        return "List of users";
    }

    @PostMapping
    public String createUser(@RequestBody String newUser){
        return "User created with request body: "+ newUser;
    }

    @GetMapping("/{id}")
    public String getAnUser(@PathVariable Integer id){
        return "User detail with id: "+ id;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Integer id, @RequestBody String editedUser){
        return "User updated with id: "+ id + " and request body: "+ editedUser;
    }

    @PatchMapping("/{id}")
    public String partialUpdateUser(@PathVariable Integer id, @RequestParam String name){
        return "Partially updated user with id: "+id+" and name: "+ name;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id){
        return "User deleted with id: "+id;
    }
}
