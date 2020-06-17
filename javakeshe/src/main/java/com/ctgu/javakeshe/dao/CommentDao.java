package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Comment;
import com.ctgu.javakeshe.entity.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    List<CommentDTO> selectCommentAndUser();

    Integer insertComment(Comment comment);

    Integer deleteComment(Integer id);

    List<CommentDTO> selectCommentAndUserByIsbn(String isbn);
}
