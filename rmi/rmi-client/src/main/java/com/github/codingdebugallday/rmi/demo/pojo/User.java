package com.github.codingdebugallday.rmi.demo.pojo;

import java.io.Serializable;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/10/16 1:56
 * @since 1.0.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7861976266444311971L;

    private String username;
    private Integer age;

    public User() {
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
