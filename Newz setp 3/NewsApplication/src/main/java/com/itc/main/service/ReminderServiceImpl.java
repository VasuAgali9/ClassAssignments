package com.itc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.model.News;
import com.itc.main.model.Reminder;
import com.itc.main.repository.ReminderRepository;


@Service
public class ReminderServiceImpl implements ReminderService {

	@Autowired
	private ReminderRepository ReminderRepository;
	
	public Reminder addReminder(Reminder reminder) {
		Reminder New_Reminder=this.ReminderRepository.save(reminder);
		return New_Reminder;
	}

	public List<Reminder> updateReminderById(Reminder reminder) {

		if (this.ReminderRepository.existsById(reminder.getReminderId())) {
			this.ReminderRepository.save(reminder);
			return (List<Reminder>) this.ReminderRepository.findAll();
		}else
		return null;
	}
	
	public void deleteReminder(int reminderId) {
		this.ReminderRepository.deleteById(reminderId);
	}

	public Reminder getReminder(int reminderId) {
		java.util.Optional<Reminder> op=this.ReminderRepository.findById(reminderId);
		if(op!=null) {
			return op.get();
		}
		return null;
	}

	public List<Reminder> getAllReminders() {
		List<Reminder> Reminder_list=this.ReminderRepository.findAll();
		return Reminder_list;
	}

}
