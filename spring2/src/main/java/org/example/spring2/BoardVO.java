package org.example.spring2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get/set, toString코드 자동 생성
@NoArgsConstructor //기본 생성자 자동 생성
@AllArgsConstructor //모든 멤버변수 생성자 자동 생성
public class BoardVO {
    private int no;
    private String title;
    private String content;
    private String writer;
}
