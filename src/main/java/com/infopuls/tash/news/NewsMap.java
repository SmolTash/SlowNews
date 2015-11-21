package com.infopuls.tash.news;

import com.infopuls.tash.user.User;

import java.util.Map;

public class NewsMap {
    private Map<User, News> userNewsMap;


    public NewsMap() {
    }

    public Map<User, News> getUserNewsMap() {
        return userNewsMap;
    }

    public void setUserNewsMap(Map<User, News> userNewsMap) {
        this.userNewsMap = userNewsMap;
    }


}
