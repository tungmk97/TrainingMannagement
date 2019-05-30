package com.aht.tranning.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;

    @Column(name = "teacher_name", length = 50)
    private String teacherName;

    @Column(name = "teacher_email", length = 50)
    private String teacherEmail;

    @Column(name = "teacher_phone", length = 20)
    private int teacherPhone;

    @Column(name = "teacher_skype", length = 50)
    private String teacherSkype;

    @ManyToMany(mappedBy = "lstTeacher")
    private List<Class> lstClass;

    public Teacher(String teacherName, String teacherEmail, int teacherPhone, String teacherSkype, List<Class> lstClass) {
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.teacherPhone = teacherPhone;
        this.teacherSkype = teacherSkype;
        this.lstClass = lstClass;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public int getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(int teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherSkype() {
        return teacherSkype;
    }

    public void setTeacherSkype(String teacherSkype) {
        this.teacherSkype = teacherSkype;
    }

    public List<Class> getLstClass() {
        return lstClass;
    }

    public void setLstClass(List<Class> lstClass) {
        this.lstClass = lstClass;
    }
}
