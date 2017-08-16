package com.edusoft.dto;

/**
 * Created by admin on 2017/8/9.
 */
public class Category {
    public String id;
    public String text;
    public  String parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }
}
