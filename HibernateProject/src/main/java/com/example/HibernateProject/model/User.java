package com.example.HibernateProject.model;
import javax.persistence.*;
import java.util.List;
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private int age;
    @OneToMany(fetch = FetchType.LAZY)
    private List<BankCard> list;

    public User() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BankCard> getList() {
        return list;
    }

    public void setList(List<BankCard> list) {
        this.list = list;
    }
}