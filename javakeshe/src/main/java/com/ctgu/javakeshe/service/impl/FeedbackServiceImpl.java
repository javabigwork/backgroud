package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.FeedbackDao;
import com.ctgu.javakeshe.entity.Feedback;
import com.ctgu.javakeshe.service.FeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Resource
    private FeedbackDao feedbackDao;


    @Override
    public List<Feedback> findFeedback() {
        return feedbackDao.selectAll();
    }

    @Override
    public Integer addFeedback(Feedback feedback) {
        feedback.setFeedbackDate(new Date());
        return feedbackDao.insertFeedback(feedback);
    }
}
