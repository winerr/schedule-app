package edu.lnu.electronics.schedule.entity;


import edu.lnu.electronics.schedule.entity.enums.Day;
import lombok.Data;

import javax.persistence.*;

//TODO add support for room number
@Entity
@Table(name = "schedule")
@Data
public class ScheduleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private SubjectModel subject;
    @OneToOne
    private TimeModel time;
    @OneToOne
    private TeacherModel teacher;
    @OneToOne
    private GroupModel group;
    @Enumerated(EnumType.ORDINAL)
    private Day day;
}
