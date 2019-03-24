package edu.lnu.electronics.schedule.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String secondName;
}
