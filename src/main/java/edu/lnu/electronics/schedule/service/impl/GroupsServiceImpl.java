package edu.lnu.electronics.schedule.service.impl;

import edu.lnu.electronics.schedule.dao.GroupsDao;
import edu.lnu.electronics.schedule.entity.GroupModel;
import edu.lnu.electronics.schedule.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsServiceImpl implements GroupsService {

    private GroupsDao groupsDao;

    @Override
    public List<GroupModel> getAllGroup() {
        return groupsDao.gelAllGroups();
    }

    @Override
    public GroupModel getGroupByName(String groupName) {
        return groupsDao.getGroupByName(groupName);
    }

    @Autowired
    public void setGroupsDao(GroupsDao groupsDao) {
        this.groupsDao = groupsDao;
    }
}
