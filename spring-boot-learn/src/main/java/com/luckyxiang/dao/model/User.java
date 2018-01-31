package com.luckyxiang.dao.model;

import javax.persistence.*;

@Table(name="m_user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    String name;
    String email;

    @Override
    public String toString() {
        return String.format("User[id=%d, name=%s, email=%s]",
                id, name, email);
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
