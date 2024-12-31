package org.example.spring3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductVO {
    private String id;
    private String title;
    private String content;
    private int price;
}
