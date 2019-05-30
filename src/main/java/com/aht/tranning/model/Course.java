package com.aht.tranning.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name = "course_name", length = 50)
    private String courseName;

    @Column(name = "day_start")
    private Date dayStart;

    @Column(name = "day_finish")
    private Date dayFinish;

    @Column(name = "course_info")
    private String courseInfo;

    @OneToMany(mappedBy = "course")
    private List<Grade> lstGrade;

    @ManyToMany(mappedBy = "lstCourse")
    private List<Class> lstClass;

    public Course(String courseName, Date dayStart, Date dayFinish, String courseInfo, List<Grade> lstGrade, List<Class> lstClass) {
        this.courseName = courseName;
        this.dayStart = dayStart;
        this.dayFinish = dayFinish;
        this.courseInfo = courseInfo;
        this.lstGrade = lstGrade;
        this.lstClass = lstClass;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayFinish() {
        return dayFinish;
    }

    public void setDayFinish(Date dayFinish) {
        this.dayFinish = dayFinish;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    public List<Grade> getLstGrade() {
        return lstGrade;
    }

    public void setLstGrade(List<Grade> lstGrade) {
        this.lstGrade = lstGrade;
    }

    public List<Class> getLstClass() {
        return lstClass;
    }

    public void setLstClass(List<Class> lstClass) {
        this.lstClass = lstClass;
    }
}
