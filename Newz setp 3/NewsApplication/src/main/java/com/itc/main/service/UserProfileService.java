package com.itc.main.service;

import java.util.List;

import com.itc.main.model.UserProfile;

public interface UserProfileService {

	public UserProfile registerUser(UserProfile user) ;

	public UserProfile updateUserProfile(UserProfile user);

	public void deleteUserProfile(String userId);

	public UserProfile getUserProfile(String userId);

	public List<UserProfile> getAllUserProfiles();

}
