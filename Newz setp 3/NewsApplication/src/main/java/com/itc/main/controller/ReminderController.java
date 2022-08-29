package com.itc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.itc.main.model.Reminder;
import com.itc.main.service.ReminderService;

@RestController
@RequestMapping("/api/v1/reminder")
public class ReminderController {
	@Autowired
	ReminderService reminderService;
	
	@GetMapping
	public ResponseEntity<List<Reminder>> getAllReminders(){
		List<Reminder> ReminderList=this.reminderService.getAllReminders();
		return new ResponseEntity<List<Reminder>>(ReminderList,HttpStatus.OK);
	}
	
	@GetMapping("/{reminderId}")
	public ResponseEntity<?> getReminder(@PathVariable int rid){
		Reminder reminder=this.reminderService.getReminder(rid);
		return new ResponseEntity<Reminder>(reminder, HttpStatus.OK);
	}
	@PostMapping()
	public ResponseEntity<Reminder> addReminder(@RequestBody Reminder addreminder){
		Reminder addlist=this.reminderService.addReminder(addreminder);
		return new ResponseEntity<Reminder>(addreminder,HttpStatus.OK);
	}
	
	@PutMapping("/{reminderId}")
	public ResponseEntity<?> updateReminderById(@PathVariable("reminderId") int rid){
		Reminder updatereminder=this.reminderService.getReminder(rid);
		Reminder updatedreminder=(Reminder) this.reminderService.updateReminderById(updatereminder);
		return new ResponseEntity<Reminder>(updatedreminder, HttpStatus.OK);
	}
	
	@DeleteMapping("/{reminderId}")
	public ResponseEntity<?> deleteReminder(@PathVariable("ReminderId") Integer rid){
		this.reminderService.deleteReminder(rid);
		return new ResponseEntity<String>("Deleted succssfully", HttpStatus.OK);
	}
	
}








