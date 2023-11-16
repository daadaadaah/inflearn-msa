package com.msa.book.domain.model.vo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDesc {

    private String description;
    private String author;
    private String isbn;
    private LocalDate publicationDate;
    private Source source;
}
