package edu.lnu.electronics.schedule.entity;

import edu.lnu.electronics.schedule.entity.enums.Semester;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "subject")
@Data
public class SubjectModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.ORDINAL)
    private Semester semester;
}
