package com.boots.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Tasks")
public class Task {

    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "user_id")
    private String user_id;
    @Column(name="date")
    private Date date;
/*    @ManyToMany(mappedBy = "tasks")
    private Set<User> _users;*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}