package com.meetingroom.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meetingroom.model.MeetingRoom;

@RestController
@RequestMapping("/meetingrooms")
public class MeetingController {
	
	
	public MeetingController() {
		
	}
	

	@PostMapping("/getAll/{startTime}/{endTime}/{numberOfPeople}")
	@ResponseBody
	public MeetingRoom getMeetingRoomWithTime(@PathVariable("startTime") String startTime,
			@PathVariable("endTime") String endTime, @PathVariable("numberOfPeople") int numberOfPeople) {

		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.setId(100);
		meetingRoom.setRoomNum(200);
		meetingRoom.setNumOfPeople(numberOfPeople);
		meetingRoom.setStartTime(LocalTime.parse(startTime));
		meetingRoom.setEndTime(LocalTime.parse(endTime));
		meetingRoom.setStatus(HttpStatus.OK);

		return meetingRoom;
	}

}
