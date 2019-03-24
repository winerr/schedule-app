package edu.lnu.electronics.schedule.dao.impl;

import edu.lnu.electronics.schedule.dao.GroupsDao;
import edu.lnu.electronics.schedule.entity.GroupModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GroupsDaoImpl implements GroupsDao {
    private static final String SELECT_ALL_GROUPS = "select g from GroupModel as g";
    private static final String SELECT_GROUP_BY_NAME = "select g from GroupModel as g where g.name=:groupName";

    private EntityManager entityManager;

    @Override
    public List<GroupModel> gelAllGroups() {
        return (List<GroupModel>) entityManager.createQuery(SELECT_ALL_GROUPS).getResultList();
    }

    @Override
    public GroupModel getGroupByName(String groupName) {
        return (GroupModel) entityManager.createQuery(SELECT_GROUP_BY_NAME).setParameter("groupName", groupName).getSingleResult();
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
