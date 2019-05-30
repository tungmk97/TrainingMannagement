package com.aht.tranning.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role", uniqueConstraints = {@UniqueConstraint(name = "role_uk", columnNames = "role_name")})
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private int roleId;

    @Column(name = "role_name", length = 30, nullable = false)
    private String roleName;

    @ManyToMany(mappedBy = "lstRole")
    private List<User> lstUser;

    public Role() {
    }

    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role(String roleName, List<User> lstUser) {
        this.roleName = roleName;
        this.lstUser = lstUser;
    }

    public List<User> getLstUser() {
        return lstUser;
    }

    public void setLstUser(List<User> lstUser) {
        this.lstUser = lstUser;
    }
}
