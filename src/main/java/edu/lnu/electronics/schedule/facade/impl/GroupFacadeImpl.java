package edu.lnu.electronics.schedule.facade.impl;

import edu.lnu.electronics.schedule.entity.GroupModel;
import edu.lnu.electronics.schedule.facade.GroupFacade;
import edu.lnu.electronics.schedule.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GroupFacadeImpl implements GroupFacade {

    private GroupsService groupsService;

    @Override
    public List<String> getListOfGroupsNames() {
        return groupsService.getAllGroup().stream().map(GroupModel::getName).collect(Collectors.toList());
    }

    @Autowired
    public void setGroupsService(GroupsService groupsService) {
        this.groupsService = groupsService;
    }
}
