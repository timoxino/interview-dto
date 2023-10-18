package com.timoxino.interview.shared.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class Question {
    private UUID uuid;
    private String name;
    private String description;
    private String type;
    private Question parent;
}
