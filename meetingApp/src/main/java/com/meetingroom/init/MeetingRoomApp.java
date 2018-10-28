package com.meetingroom.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.meetingroom")
public class MeetingRoomApp {

	public static void main(String[] args) {
		SpringApplication.run(MeetingRoomApp.class, args);
	}

}