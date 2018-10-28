package com.meetingroom;


import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.meetingroom.controller.MeetingController;
import com.meetingroom.init.MeetingRoomApp;
import com.meetingroom.model.MeetingRoom;



@SpringBootTest(classes = MeetingRoomApp.class)
@RunWith(SpringRunner.class)
public class MeetingRoomTest {

	@Autowired
	MeetingRoom meetingRoom;
	

	@Test
	public void getMeetingRoomWithTimeTest() {
	String startTime = "12:15:25";
	String endTime  = "12:25:30";
	int numOfPeople = 4;
	
	MeetingRoom m1 = new MeetingRoom();
	m1.setId(100);
	m1.setRoomNum(200);
	m1.setNumOfPeople(numOfPeople);
	m1.setStartTime(LocalTime.parse(startTime));
	m1.setNumOfPeople(numOfPeople);
	m1.setEndTime(LocalTime.parse(endTime));
	
	MeetingController mController = new MeetingController();
	MeetingRoom m2 = mController.getMeetingRoomWithTime(startTime, endTime, numOfPeople);
	
	Assert.assertEquals(m1.getId(), m2.getId());
	Assert.assertEquals(m1.getStartTime(), m2.getStartTime());
	Assert.assertEquals(m1.getEndTime(), m2.getEndTime());
	Assert.assertEquals(m1.getRoomNum(), m2.getRoomNum());
	Assert.assertEquals(m1.getNumOfPeople(), m2.getNumOfPeople());
	
 }
}
