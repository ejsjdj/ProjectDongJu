package com.example.webapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Poem {
    /** 시 ID */
    private Integer id;
    /** 시 제목 */
    private String title;
    /** 시 작가 */
    private String author;
    /** 시 내용 */
    private String contents;
}
