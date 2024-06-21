package com.example.product_final.domain.vo;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component //컨테이너에 등록해주는 이유?? 주입받아서 안쓰잖아
@Data
public class productVO {
    private Long id; //long 과 Long 차이, Long 은 참조타입, null 사용가능
    private String name;
    private Double price;
    private String category;
    private String description;

    public productVO() {}

    @Builder
    public productVO(Long id, String name, Double price, String category, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}