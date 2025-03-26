package com.example.webapp.service;

import com.example.webapp.entity.Poem;

import java.util.List;

/**
 * Poem: 서비스
 */
public interface PoemService {

    /**
     * 모든 '시'를 조회합니다.
     */
    List<Poem> findAllPoem();

    /**
     * 특정 ID의 '시'를 조회합니다.
     */
    Poem findPoemById(Integer id);

    /**
     * '시'를 새로 등록합니다.
     */
    void insertPoem(Poem poem);

    /**
     * '시'를 업데이트 합니다.
     */
    void updatePoem(Poem poem);

    /**
     * 특정 ID의 '시'를 삭제합니다.
     */
    void deletePoem(Integer id);
}
