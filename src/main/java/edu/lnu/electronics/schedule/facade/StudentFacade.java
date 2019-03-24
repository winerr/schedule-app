package edu.lnu.electronics.schedule.facade;

import edu.lnu.electronics.schedule.entity.StudentModel;

import java.util.List;
import java.util.Map;

public interface StudentFacade {

    Map<String, List<StudentModel>> getAllStudent();

    Map<String, List<StudentModel>> getStudentForGroup(String groupName);
}
