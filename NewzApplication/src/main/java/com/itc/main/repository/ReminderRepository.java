package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itc.main.entity.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder,Integer> {

}
