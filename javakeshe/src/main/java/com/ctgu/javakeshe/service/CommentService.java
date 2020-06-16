package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Comment;
import com.ctgu.javakeshe.entity.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> findCommentAndUser();

    Integer addComment(Comment comment);

    Integer deleteComment(Integer id);
}
