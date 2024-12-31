package com.example.spring5.board.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BoardVO {
    private String id;
    private String pw;
    private String name;
    private String tel;
}
