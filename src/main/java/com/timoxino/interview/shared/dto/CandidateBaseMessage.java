package com.timoxino.interview.shared.dto;

import lombok.Data;

@Data
public class CandidateBaseMessage {
    private String cvUri;
    private String role;
    private Integer lvlExpected;
}
