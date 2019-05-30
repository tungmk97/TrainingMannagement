package com.aht.tranning.model;

import javax.persistence.*;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolId;

    @Column(name = "school_name", nullable = false, length = 50)
    private String schoolName;

    @Column(name = "facutly", length = 50)
    private String faculty;

    @Column(name = "name_dean", length = 50)
    private String name_dean;

    @Column(name = "email_school", length = 50)
    private String email_school;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY)
    private List<Student> lstStudent;

    public School() {
    }

    public School(String schoolName, String faculty, String name_dean, String email_school) {
        this.schoolName = schoolName;
        this.faculty = faculty;
        this.name_dean = name_dean;
        this.email_school = email_school;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName_dean() {
        return name_dean;
    }

    public void setName_dean(String name_dean) {
        this.name_dean = name_dean;
    }

    public String getEmail_school() {
        return email_school;
    }

    public void setEmail_school(String email_school) {
        this.email_school = email_school;
    }

    public List<Student> getLstStudent() {
        return lstStudent;
    }

    public void setLstStudent(List<Student> lstStudent) {
        this.lstStudent = lstStudent;
    }


}
