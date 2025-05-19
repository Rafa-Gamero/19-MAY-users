package com.ironhack.users_micro.controller;

import com.ironhack.users_micro.dto.UserWithAccountsDTO;
import com.ironhack.users_micro.dto.UserPatchAccountDTO;
import com.ironhack.users_micro.exception.UserNotFoundException;
import com.ironhack.users_micro.model.User;
import com.ironhack.users_micro.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PatchMapping("/account/{userId}")
    public ResponseEntity<?> patchAccountId(@RequestBody UserPatchAccountDTO userPatchAccountDTO, @PathVariable("userId") Long userId) {
        try {
            User updatedUser = userService.patchAccountId(userId, userPatchAccountDTO.getAccountID());
            return new ResponseEntity<>(updatedUser, HttpStatus.ACCEPTED);
        } catch (UserNotFoundException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}