package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Feedback;

import java.util.List;

public interface FeedbackService {
    List<Feedback> findFeedback();

    Integer addFeedback(Feedback feedback);
}
