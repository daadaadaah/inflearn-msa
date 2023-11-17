package com.msa.book.domain.model;

import com.msa.book.domain.model.vo.BookDesc;
import com.msa.book.domain.model.vo.BookStatus;
import com.msa.book.domain.model.vo.Classfication;
import com.msa.book.domain.model.vo.Location;
import com.msa.book.domain.model.vo.Source;
import java.time.LocalDate;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long no;
    private String title;

    @Embedded
    private BookDesc desc;
    private Classfication classfication;
    private BookStatus bookStatus;
    private Location location;

    public static Book enterBook(String title, String author, String isbn, String description, LocalDate publicationDate, Source source, Classfication classfication, Location location) {
        BookDesc bookDesc = BookDesc.createBookDesc(author, isbn, description, publicationDate, source);

        Book book = new Book();
        book.setTitle(title);
        book.setDesc(bookDesc);
        book.setClassfication(classfication);
        book.setLocation(location);
        book.setBookStatus(BookStatus.ENTERED);
        return book;
    }

    public static Book sample(){
        return enterBook("엔터프라이즈 아키텍처 패턴","마틴파울러","21321321","엔터프라이즈 패턴 에 관한 좋은 서적", LocalDate.now(),
            Source.SUPPLY,
            Classfication.COMPUTER,
            Location.JEONGJA);
    }

    public Book makeAvailable() {
        this.setBookStatus(BookStatus.AVAILABLE);
        return this;
    }

    public Book makeUnavailable() {
        this.setBookStatus(BookStatus.UNAVAILABLE);
        return this;
    }
}

