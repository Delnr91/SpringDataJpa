package com.jpa.realtions.bidiretional.manyToMany;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_Author_ManyToMany")
@Table(name = "bi_Author_ManyToMany")

public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany (mappedBy = "authorList")
    private List<Book> bookList;


}
