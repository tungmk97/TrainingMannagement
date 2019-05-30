package com.aht.tranning.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @Column(name = "home_town", nullable = false, length = 50)
    private String homeTown;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "graduating", length = 10)
    private String graduating;

    @Column(name = "date_graduating")
    private Date dateGraduating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id")
    private Class aClass;

    @OneToMany(mappedBy = "student")
    private List<Grade> lstGrade;

    public Student() {
    }

    public Student(String fullName, Date birthday, String homeTown, String address, String graduating, Date dateGraduating, School school) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.homeTown = homeTown;
        this.address = address;
        this.graduating = graduating;
        this.dateGraduating = dateGraduating;
        this.school = school;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGraduating() {
        return graduating;
    }

    public void setGraduating(String graduating) {
        this.graduating = graduating;
    }

    public Date getDateGraduating() {
        return dateGraduating;
    }

    public void setDateGraduating(Date dateGraduating) {
        this.dateGraduating = dateGraduating;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public List<Grade> getLstGrade() {
        return lstGrade;
    }

    public void setLstGrade(List<Grade> lstGrade) {
        this.lstGrade = lstGrade;
    }
}
