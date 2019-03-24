package edu.lnu.electronics.schedule.entity;


import edu.lnu.electronics.schedule.entity.enums.Department;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@Data
public class TeacherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String secondName;
    private String middleName;
    @Enumerated(EnumType.STRING)
    private Department department;
}
