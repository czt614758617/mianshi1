package com.francis.alibaba.entity;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "material")
public class Material implements Serializable {

    @Id
    private Long id;
    private String createUser;
    private String name;

    private Integer num;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createUser", referencedColumnName = "username", insertable = false, updatable = false)
    private User user;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
