package com.aht.tranning.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(name = "user_uk", columnNames = "user_name")})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "user_name", length = 36, nullable = false)
    private String userName;

    @Column(name = "password", length = 128, nullable = false)
    private String password;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn
            (name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> lstRole;

    public User() {
    }

    public User(int userId, String fullName, String userName, String password, String email) {
        this.userId = userId;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getLstRole() {
        return lstRole;
    }

    public void setLstRole(List<Role> lstRole) {
        this.lstRole = lstRole;
    }
}
