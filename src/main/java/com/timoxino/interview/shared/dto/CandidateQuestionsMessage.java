package com.timoxino.interview.shared.dto;

import com.google.common.collect.Multimap;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CandidateQuestionsMessage extends CandidateEstimatedMessage {
    private Multimap<String, Question> questions;
}
