package com.itc.main.service;

import java.util.List;

import com.itc.main.model.Reminder;

public interface ReminderService {

	public Reminder addReminder(Reminder reminder);

	public List<Reminder> updateReminderById(Reminder reminder);

	public void deleteReminder(int reminderId);

	public Reminder getReminder(int reminderId);

	public List<Reminder> getAllReminders();

}
