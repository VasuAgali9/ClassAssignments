package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itc.main.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile,Integer> {

}
