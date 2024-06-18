package com.example.b_dependency.Lombok;

import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Data
public class member {
    @NonNull
    private String name;
    private int age;
    private String gender;
    private String address;
}
