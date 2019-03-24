package edu.lnu.electronics.schedule.dao.impl;

import edu.lnu.electronics.schedule.dao.ScheduleDao;
import edu.lnu.electronics.schedule.entity.ScheduleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ScheduleDaoImpl implements ScheduleDao {

    private static final String SELECT_SCHEDULE_FOR_GROUP = "select s from ScheduleModel as s " +
            "where s.group.name=:groupName";
    private static final String SELECT_ALL_SCHEDULE = "select s from ScheduleModel as s";

    private EntityManager entityManager;

    @Override
    public List<ScheduleModel> getScheduleForGroup(String groupName) {
        return (List<ScheduleModel>) entityManager.createQuery(SELECT_SCHEDULE_FOR_GROUP).setParameter("groupName", groupName).getResultList();
    }

    @Override
    public List<ScheduleModel> getAllSchedule() {
        return (List<ScheduleModel>) entityManager.createQuery(SELECT_ALL_SCHEDULE).getResultList();
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
