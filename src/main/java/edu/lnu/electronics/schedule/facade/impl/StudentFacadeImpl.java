package edu.lnu.electronics.schedule.facade.impl;

import edu.lnu.electronics.schedule.entity.GroupModel;
import edu.lnu.electronics.schedule.entity.ScheduleModel;
import edu.lnu.electronics.schedule.entity.StudentModel;
import edu.lnu.electronics.schedule.facade.StudentFacade;
import edu.lnu.electronics.schedule.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Component
public class StudentFacadeImpl implements StudentFacade {

    private GroupsService groupsService;

    @Override
    public Map<String, List<StudentModel>> getAllStudent() {
        List<GroupModel> groups = groupsService.getAllGroup().stream().sorted( (f, s) ->
            Integer.compare(getGroupNumber(s.getName()), getGroupNumber(f.getName()))
        ).collect(Collectors.toList());

        Map<String, List<StudentModel>> students = new TreeMap<>();
        groups.forEach(g -> students.put(g.getName(), g.getStudents()));

        return students;
    }

    @Override
    public Map<String, List<StudentModel>> getStudentForGroup(String groupName) {
        GroupModel group = groupsService.getGroupByName(groupName);
        return Collections.singletonMap(group.getName(), group.getStudents());
    }

    private int getGroupNumber(String groupName){
        return Integer.valueOf(groupName.substring(groupName.indexOf('-')));
    }

    @Autowired
    public void setGroupsService(GroupsService groupsService) {
        this.groupsService = groupsService;
    }
}
