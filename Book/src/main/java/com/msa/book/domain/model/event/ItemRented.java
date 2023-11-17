package com.msa.book.domain.model.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ItemRented implements Serializable {
    private IDName idName;
    private Item item;
    private long point;
}
