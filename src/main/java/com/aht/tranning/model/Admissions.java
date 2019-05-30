package com.aht.tranning.model;

import javax.persistence.*;
import java.util.Date;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "admissions")
public class Admissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admissionId;

    @Column(name = "day_start")
    private Date dayStart;

    @Column(name = "day_finish")
    private Date dayFinish;

    @Column(name = "person_in_change", length = 50)
    private String personInChange;

    public Admissions(Date dayStart, Date dayFinish, String personInChange) {
        this.dayStart = dayStart;
        this.dayFinish = dayFinish;
        this.personInChange = personInChange;
    }

    public int getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(int admissionId) {
        this.admissionId = admissionId;
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

    public String getPersonInChange() {
        return personInChange;
    }

    public void setPersonInChange(String personInChange) {
        this.personInChange = personInChange;
    }
}
