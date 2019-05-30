package com.aht.tranning.model;

import javax.persistence.*;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gradeId;

    @ManyToOne(fetch =  FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id")
    private TestContent testContent;

    @Column(name = "point")
    private double point;

    public Grade(Student student, Subject subject, Course course, TestContent testContent, double point) {
        this.student = student;
        this.subject = subject;
        this.course = course;
        this.testContent = testContent;
        this.point = point;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public TestContent getTestContent() {
        return testContent;
    }

    public void setTestContent(TestContent testContent) {
        this.testContent = testContent;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
