package com.example.webapp.entity;

import lombok.Data;

@Data
public class Comment {
//    -- 기본키
//    id SERIAL PRIMARY KEY,
//    -- 닉네임
//    nickname VARCHAR(20) NOT NULL,
//    -- 비밀번호
//    password VARCHAR(20) NOT NULL,
//    -- 댓글 내용
//    comment VARCHAR(255) NOT NULL,
//    -- 댓글이 달린 시의 ID
//    poemId INTEGER NOT NULL,
//    -- 대댓글일 경우 부모댓글의 번호
//    parentCommentId INTEGER NULL

    // 댓글 id
    int id;
    // 닉네임
    String nickname;
    // 비밀번호
    String password;
    // 댓글 내용
    String comment;
    // 댓글이 달린 시의 ID
    int poemId;
    // 대댓글일 경우 부모댓글의 번호
    int parentCommentId;
}
