package edu.lnu.electronics.schedule.facade.impl;

import edu.lnu.electronics.schedule.entity.ScheduleModel;
import edu.lnu.electronics.schedule.entity.enums.Day;
import edu.lnu.electronics.schedule.facade.ScheduleFacade;
import edu.lnu.electronics.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ScheduleFacadeImpl implements ScheduleFacade {
    private ScheduleService scheduleService;

    @Override
    public Map<String, List<ScheduleModel>> getScheduleForGroup(String groupName) {
        List<ScheduleModel> schedule = scheduleService.getScheduleForGroup(groupName);
        return convertListOfScheduleToMap(schedule);
    }

    @Override
    public Map<String, List<ScheduleModel>> getAllSchedule() {
        List<ScheduleModel> schedule = scheduleService.getAllSchedule();
        return convertListOfScheduleToMap(schedule);
    }

    private Map<String, List<ScheduleModel>> convertListOfScheduleToMap(List<ScheduleModel> schedule){
        Map<String, List<ScheduleModel>> mapOfSchedule = new HashMap<>();

        mapOfSchedule.put("mon", schedule.stream().filter(s -> s.getDay().equals(Day.MON)).collect(Collectors.toList()));
        mapOfSchedule.put("tue", schedule.stream().filter(s -> s.getDay().equals(Day.TUE)).collect(Collectors.toList()));
        mapOfSchedule.put("wed", schedule.stream().filter(s -> s.getDay().equals(Day.WED)).collect(Collectors.toList()));
        mapOfSchedule.put("thu", schedule.stream().filter(s -> s.getDay().equals(Day.THU)).collect(Collectors.toList()));
        mapOfSchedule.put("fri", schedule.stream().filter(s -> s.getDay().equals(Day.FRI)).collect(Collectors.toList()));

        return mapOfSchedule;
    }

    @Autowired
    public void setScheduleService(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }
}
