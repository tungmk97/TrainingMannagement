package com.aht.tranning.model;

import javax.persistence.*;
import java.util.List;

/**
 * create by TungNguyen on May, 2019
 */
@Entity
@Table(name = "test_content")
public class TestContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int testId;

    @Column(name = "test_name")
    private String testName;

    @Column(name = "test_content")
    private String testContent;

    @Column(name = "prioritize")
    private int prioritize;

    @OneToMany(mappedBy = "testContent")
    private List<TestContent> lstTest;

    public TestContent(String testName, String testContent, int prioritize, List<TestContent> lstTest) {
        this.testName = testName;
        this.testContent = testContent;
        this.prioritize = prioritize;
        this.lstTest = lstTest;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    public int getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(int prioritize) {
        this.prioritize = prioritize;
    }

    public List<TestContent> getLstTest() {
        return lstTest;
    }

    public void setLstTest(List<TestContent> lstTest) {
        this.lstTest = lstTest;
    }
}
