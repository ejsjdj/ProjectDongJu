package com.example.webapp.repository;

import com.example.webapp.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CommentMapper {

    /**
     * 지정된 시의 ID에 해당하는 '댓글'를 가져옵니다.
     */
    List<Comment> selectCommentById(@Param("id") Integer poemId);

    /**
     * '댓글'를 등록합니다.
     */
    void insertComment(Comment comment);

    /**
     * '대댓글'을 등록합니다.
     */
    void insertRecomment(Comment comment);

    /**
     * 지정된 ID의 '댓글'를 삭제합니다.
     */
    void deleteComment(@Param("id") Integer id);
}
