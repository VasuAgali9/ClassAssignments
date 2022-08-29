package com.itc.main.service;

import java.util.List;

import com.itc.main.model.UserProfile;
import com.itc.main.repository.UserProfileRepository;

public class UserProfileServiceImpl implements UserProfileService {
	
	private UserProfileRepository UserProfileRepository;
	public UserProfile registerUser(UserProfile user){
		UserProfile new_user=this.UserProfileRepository.save(user);
		return new_user;
	}

	public UserProfile updateUserProfile(UserProfile user){
		UserProfile updated_user=this.UserProfileRepository.saveAndFlush(user);
		return updated_user;
	}

	public void deleteUserProfile(String userId){
		this.UserProfileRepository.deleteById(userId);	
	}
	
	public UserProfile getUserProfile(String userId){
		java.util.Optional<UserProfile> op=UserProfileRepository.findById(userId);
		if(op!=null) {
			return op.get();
		}else
		return null;
	}


	public List<UserProfile> getAllUserProfiles() {
		List<UserProfile> user_list=this.UserProfileRepository.findAll();
		return user_list;
	}

}
