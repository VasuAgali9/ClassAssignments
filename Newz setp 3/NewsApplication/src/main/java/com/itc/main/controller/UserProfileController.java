package com.itc.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.main.model.UserProfile;
import com.itc.main.service.UserProfileService;

@RestController
@RequestMapping("/api/v1/user")
public class UserProfileController {
	UserProfileService userprofileService;
	
	@PostMapping()
	public ResponseEntity<UserProfile> registerUser(@RequestBody UserProfile adduser){
		this.userprofileService.registerUser(adduser);
		return new ResponseEntity<UserProfile>(adduser,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<UserProfile>> getAllUserProfiles(){
		List<UserProfile> userlist=this.userprofileService.getAllUserProfiles();
		return new ResponseEntity<List<UserProfile>>(userlist, HttpStatus.OK);
		
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<?> updateUserProfile(@PathVariable("userId") String uid){
		UserProfile updateuser=this.userprofileService.getUserProfile(uid);
		return new ResponseEntity<UserProfile>(updateuser, HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<?> getUserProfile(@PathVariable String uid){
		UserProfile user=this.userprofileService.getUserProfile(uid);
		return new ResponseEntity<UserProfile>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUserProfile (@PathVariable("userId") String uid){
		this.userprofileService.deleteUserProfile(uid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
	

}
