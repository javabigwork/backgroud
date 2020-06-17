package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedbackDao {

    List<Feedback> selectAll();

    Integer insertFeedback(Feedback feedback);
}
