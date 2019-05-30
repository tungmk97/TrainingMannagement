package com.aht.tranning.model;

import javax.persistence.*;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "class")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classId;

    @Column(name = "class_name", length = 50)
    private String className;

    @OneToMany(mappedBy = "aClass", fetch = FetchType.LAZY)
    private List<Student> lstStudent;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "class_teacher", joinColumns = {@JoinColumn(name = "class_id")},
        inverseJoinColumns = {@JoinColumn(name = "teacher_id")})
    private List<Teacher> lstTeacher;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_class",//
             joinColumns = {@JoinColumn(name = "class_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private List<Course> lstCourse;

    public Class(String className) {
        this.className = className;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
