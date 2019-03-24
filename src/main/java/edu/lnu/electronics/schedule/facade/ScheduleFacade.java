package edu.lnu.electronics.schedule.facade;

import edu.lnu.electronics.schedule.entity.ScheduleModel;

import java.util.List;
import java.util.Map;

public interface ScheduleFacade {

    Map<String, List<ScheduleModel>> getScheduleForGroup(String groupName);

    Map<String, List<ScheduleModel>> getAllSchedule();

}
