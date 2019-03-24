package edu.lnu.electronics.schedule.service;

import edu.lnu.electronics.schedule.entity.ScheduleModel;

import java.util.List;

public interface ScheduleService {

    List<ScheduleModel> getScheduleForGroup(String groupName);

    List<ScheduleModel> getAllSchedule();

}
