package edu.lnu.electronics.schedule.service.impl;

import edu.lnu.electronics.schedule.dao.ScheduleDao;
import edu.lnu.electronics.schedule.entity.ScheduleModel;
import edu.lnu.electronics.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private ScheduleDao scheduleDao;

    @Override
    public List<ScheduleModel> getScheduleForGroup(String groupName) {
        return scheduleDao.getScheduleForGroup(groupName);
    }

    @Override
    public List<ScheduleModel> getAllSchedule() {
        return scheduleDao.getAllSchedule();
    }

    @Autowired
    public void setScheduleDao(ScheduleDao scheduleDao) {
        this.scheduleDao = scheduleDao;
    }
}
