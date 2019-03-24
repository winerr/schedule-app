package edu.lnu.electronics.schedule.dao;

import edu.lnu.electronics.schedule.entity.ScheduleModel;

import java.util.List;

public interface ScheduleDao {

    List<ScheduleModel> getScheduleForGroup(String groupName);

    List<ScheduleModel> getAllSchedule();

}
