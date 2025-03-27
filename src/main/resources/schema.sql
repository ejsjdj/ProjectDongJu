-- 테이블이 존재하면 삭제
DROP TABLE IF EXISTS POEMS;
DROP TABLE IF EXISTS COMMENTS;

-- POEMS 테이블 생성
CREATE TABLE poems (
    -- 기본키로서 ID: 자동 증가
    id serial PRIMARY KEY,
    -- 시 제목: NULL을 허용하지 않음
    title VARCHAR(255) NOT NULL,
    -- 시 저자명: NULL을 허용하지 않음
    author VARCHAR(255) NOT NULL,
    -- 시 내용
    contents TEXT NOT NULL
);

CREATE TABLE comments (
    -- 기본키
    id SERIAL PRIMARY KEY,
    -- 닉네임
    nickname VARCHAR(20) NOT NULL,
    -- 비밀번호
    password VARCHAR(20) NOT NULL,
    -- 댓글 내용
    comment VARCHAR(255) NOT NULL,
    -- 댓글이 달린 시의 ID
    poemId INTEGER NOT NULL,
    -- 대댓글일 경우 부모댓글의 번호
    parentCommentId INTEGER NULL
);