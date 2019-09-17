package com.belhard.tc.web.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belhard.tc.web.beans.UserBean;

@RestController
@RequestMapping(value = "/api/users", 
                produces = MediaType.APPLICATION_JSON_VALUE)
public class UserApi {

	private static List<UserBean> allUsers = new ArrayList<>();
	
	static {
		allUsers.add(new UserBean(1, "ivan", "123"));
		allUsers.add(new UserBean(2, "petr", "123"));
		allUsers.add(new UserBean(3, "sidor", "123"));
	}

	@GetMapping
	public ResponseEntity<List<UserBean>> getAllUsers() {
		return new ResponseEntity<>(allUsers, HttpStatus.OK);
	}

	@PutMapping
	public void saveUser(UserBean newUser) {
		
	}

	@PostMapping
	public void updateUser(UserBean existUser) {
		
	}

	@DeleteMapping
	public void deleteUser(Integer userId) {
		
	}
}
