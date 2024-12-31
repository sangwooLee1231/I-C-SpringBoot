package com.example.spring5.cart.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CartVO {
    private String id;
    private String pw;
    private String name;
    private String tel;
}
