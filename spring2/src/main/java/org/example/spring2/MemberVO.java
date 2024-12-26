package org.example.spring2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get/set/toString
@AllArgsConstructor //모든 변수들 넣은 생성자
@NoArgsConstructor //기본 생성자
public class MemberVO {
    private String id;
    private String pw;
    private String name;
    private String tel;
    //set메서드 : 값을 넣을 때!!
    //스프링이 클라이언트로 부터 받은 데이터를
    //vo의 각 set메서드를 불러서 넣어줌.
    //set메서드가 반드시 있어야함.
}