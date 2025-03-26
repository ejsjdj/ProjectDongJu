package com.example.webapp.repository;

import com.example.webapp.entity.Poem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface PoemMapper {

    /**
     * 모든 '시'를 가져옵니다.
     */
    List<Poem> selectAllPoem();

    /**
     * 지정된 ID에 해당하는 '시'를 가져옵니다.
     */
    Poem selectPoemById(@Param("id") Integer id);

    /**
     * 지정된 ID에 해당하는 '시'를 업데이트합니다.
     */
    void updatePoem(@Param("id") Poem poem);

    /**
     * '시'를 등록합니다.
     */
    void insertPoem(Poem poem);

    /**
     * 지정된 ID의 '시'를 삭제합니다.
     */
    void deletePoem(@Param("id") Integer id);
}
