package com.example.springboot_remote_m.domain;

import javax.persistence.*;

@Entity
@Table(name = "remote_m.user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String passwd;
    private String name;
    private String phone_number;

    public User(String id, String passwd, String name, String phone_number) {
        this.id = id;
        this.passwd = passwd;
        this.name = name;
        this.phone_number = phone_number;
    }

    public User(){}

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getPhone_number() {
        return phone_number;
    }
}
