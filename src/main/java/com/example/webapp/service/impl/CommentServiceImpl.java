package com.example.webapp.service.impl;

import com.example.webapp.entity.Comment;
import com.example.webapp.entity.Poem;
import com.example.webapp.repository.CommentMapper;
import com.example.webapp.repository.PoemMapper;
import com.example.webapp.service.CommentService;
import com.example.webapp.service.PoemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    /** DI */
    private final CommentMapper commentMapper;

    @Override
    public List<Comment> findCommentById(Integer id) {
        return commentMapper.selectCommentById(id);
    }

    @Override
    public void insertComment(Comment comment) {
        commentMapper.insertComment(comment);
    }

    @Override
    public void insertRecomment(Comment comment) {
        commentMapper.insertRecomment(comment);
    }

    @Override
    public void deleteComment(Integer id) {
        commentMapper.deleteComment(id);
    }
}
