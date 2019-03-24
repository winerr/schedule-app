package edu.lnu.electronics.schedule.dao;

import edu.lnu.electronics.schedule.entity.GroupModel;

import java.util.List;

public interface GroupsDao {

    List<GroupModel> gelAllGroups();

    GroupModel getGroupByName(String groupName);
}
