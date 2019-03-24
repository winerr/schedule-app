package edu.lnu.electronics.schedule.service;

import edu.lnu.electronics.schedule.entity.GroupModel;

import java.util.List;

public interface GroupsService {

    List<GroupModel> getAllGroup();

    GroupModel getGroupByName(String groupName);
}
