-- 테이블이 존재하면 삭제
DROP TABLE IF EXISTS POEMS;

-- poem 테이블 생성
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