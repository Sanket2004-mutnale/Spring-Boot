package com.main.service;

import com.main.entity.User;
import com.main.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

	@Override
	public List<User> getallUser() {

		
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserdetailbyid(int id) {
		
		return userRepository.findById(id);
	}

	@Override
	public User updateUserDetails(int id, User newuser) {
		User userDate=userRepository.findById(id).orElse(null);
		if(userDate!=null) {
			return userRepository.save(newuser);
		}
		else {
			throw new RuntimeException("user not found with id:"+id);
		}
		  
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}

	
}
