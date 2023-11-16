package com.msa.rental.domain.model.vo;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Integer no;
    private String title;

    public static Item Sample() {
        return new Item(10,"노인과바다");
    }
}
