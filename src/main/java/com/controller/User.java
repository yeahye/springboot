package com.controller;

import java.util.Objects;

/**
 * @ClassName User
 * @Description TODO
 * @Author yejunnan
 * @Date 2019/6/10 19:20
 * @VERSION 1.0
 */
public class User {

    private String name;

    private Integer age;

    public User() {

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Long l = 3L;
        Integer integer = 3;
        System.out.println(l.equals(integer));
    }
}
