package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.CommentDao;
import com.ctgu.javakeshe.entity.Comment;
import com.ctgu.javakeshe.entity.CommentDTO;
import com.ctgu.javakeshe.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentDao commentDao;

    @Override
    public List<CommentDTO> findCommentAndUser() {
        List<CommentDTO> list = commentDao.selectCommentAndUser();
        return list;
    }

    @Override
    public Integer addComment(Comment comment) {
        comment.setCommentDate(new Date());
        return commentDao.insertComment(comment);
    }

    @Override
    public Integer deleteComment(Integer id) {
        return commentDao.deleteComment(id);
    }

    @Override
    public List<CommentDTO> findCommentAndUserByIsbn(String isbn) {
        return commentDao.selectCommentAndUserByIsbn(isbn);
    }
}
