package com.aht.tranning.model;

import javax.persistence.*;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectId;

    @Column(name = "subject_name", length = 50)
    private String subjectName;

    @Column(name = "subject_content", length = 50)
    private String subjectContent;

    @Column(name = "subject_note", length = 500)
    private String subjectNote;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "subject")
    private List<Grade> lstGrade;


    public Subject(String subjectName, String subjectContent, String subjectNote, Course course, List<Grade> lstGrade) {
        this.subjectName = subjectName;
        this.subjectContent = subjectContent;
        this.subjectNote = subjectNote;
        this.course = course;
        this.lstGrade = lstGrade;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectContent() {
        return subjectContent;
    }

    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent;
    }

    public String getSubjectNote() {
        return subjectNote;
    }

    public void setSubjectNote(String subjectNote) {
        this.subjectNote = subjectNote;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Grade> getLstGrade() {
        return lstGrade;
    }

    public void setLstGrade(List<Grade> lstGrade) {
        this.lstGrade = lstGrade;
    }
}
