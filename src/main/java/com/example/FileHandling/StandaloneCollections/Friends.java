package com.example.FileHandling.StandaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Friends {
    private List<String> friendNames;

    private Map<String,Integer> fessData;

    private Set<String> cityName;

    public Set<String> getCityName() {
        return cityName;
    }

    public void setCityName(Set<String> cityName) {
        this.cityName = cityName;
    }

    public Map<String, Integer> getFessData() {
        return fessData;
    }

    public void setFessData(Map<String, Integer> fessData) {
        this.fessData = fessData;
    }

    public List<String> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<String> friendNames) {
        this.friendNames = friendNames;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "friendNames=" + friendNames +
                ", fessData=" + fessData +
                ", cityName=" + cityName +
                '}';
    }
}
