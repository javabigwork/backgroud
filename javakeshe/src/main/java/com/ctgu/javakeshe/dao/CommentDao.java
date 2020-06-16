package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Comment;
import com.ctgu.javakeshe.entity.CommentDTO;

import java.util.List;

public interface CommentDao {
    List<CommentDTO> selectCommentAndUser();

    Integer insertComment(Comment comment);

    Integer deleteComment(Integer id);
}
