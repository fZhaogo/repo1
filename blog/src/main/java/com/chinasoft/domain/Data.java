package com.chinasoft.domain;

import java.util.Map;

/**
 * @Description TODO
 * @ClassName Data
 * @Author 86173
 * @Date 2020/3/11 2:41
 * @Version V1.0
 */
public class Data {
    private String image;
    private Map<String,String[]> map;

    public Data(String image, Map<String, String[]> map) {
        this.image = image;
        this.map = map;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map<String, String[]> getMap() {
        return map;
    }

    public void setMap(Map<String, String[]> map) {
        this.map = map;
    }
}
