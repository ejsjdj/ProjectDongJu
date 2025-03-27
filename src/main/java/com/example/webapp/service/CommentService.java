package com.example.webapp.service;

import com.example.webapp.entity.Comment;

import java.util.List;

/**
 * Poem: 서비스
 */
public interface CommentService {

    /**
     * 시의 ID에 해당하는 '댓글'을 조회합니다.
     */
    List<Comment> findCommentById(Integer id);

    /**
     * '댓글'을 새로 등록합니다.
     */
    void insertComment(Comment comment);

    /**
     * '대댓글'을 새로 등록합니다.
     */
    void insertRecomment(Comment comment);

    /**
     * 특정 ID의 '시'를 삭제합니다.
     */
    void deleteComment(Integer id);
}