package com.busyduniadevs.meditation.model;

import java.util.List;

public class AnswerModel {
    private String userId;
    private String name;
    private String text;
    private String date;
    private String qtsn;
    private int likes;
    private List<CommentModel> comments;

    public AnswerModel() {
        // Required empty public constructor
    }

    public AnswerModel(String text, String date, String qtsn, String name) {
        this.text = text;
        this.date = date;
        this.qtsn = qtsn;
        this.name = name;
    }

    public String getText() {
        return text;
    }
    public String getDate() {
        return date;
    }
    public String getqtsn() {
        return qtsn;
    }
    public String getname() {
        return name;
    }

}

