package com.main.service;

import java.util.List;
import java.util.Optional;

import com.main.entity.User;

public interface UserService {
   public User createUser(User user);
    public List<User>getallUser();
    public Optional<User> getUserdetailbyid(int id);
    public User updateUserDetails(int id,User newuser);
    public void deleteUser(int id);
}
