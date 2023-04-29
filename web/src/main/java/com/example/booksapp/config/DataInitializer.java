package com.example.booksapp.config;

import com.example.booksapp.model.enumerations.Category;
import com.example.booksapp.service.AuthorService;
import com.example.booksapp.service.BookService;
import com.example.booksapp.service.CountryService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    /*
        Used if application works with H2 DB
     */

    private final BookService bookService;
    private final AuthorService authorService;
    private final CountryService countryService;

    public DataInitializer(BookService bookService, AuthorService authorService, CountryService countryService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.countryService = countryService;
    }

    @PostConstruct
    public void initData() {
        this.countryService.save("Macedonia", "Europe");
        this.countryService.save("China", "Asia");
        this.countryService.save("Serbia", "Europe");
        this.countryService.save("UK", "Europe");
        this.countryService.save("Germany", "Europe");
        this.countryService.save("Russia", "Asia");
        this.countryService.save("USA", "North America");
        this.countryService.save("Nigeria", "Africa");
        this.countryService.save("Greece", "Europe");
        this.countryService.save("Israel", "Asia");
        this.countryService.save("Egypt", "Africa");
        this.countryService.save("Mexico", "Central America");
        this.countryService.save("Italy", "Europe");
        this.countryService.save("India", "Asia");
        this.countryService.save("Argentina", "South America");
        this.countryService.save("Poland", "Europe");

        this.authorService.save("Blaze", "Koneski", Long.parseLong("1"));
        this.authorService.save("Ji", "Xyong", Long.parseLong("2"));
        this.authorService.save("Ivo", "Andric", Long.parseLong("3"));
        this.authorService.save("William", "Shakespeare", Long.parseLong("4"));
        this.authorService.save("Friedrich", "Nietzsche", Long.parseLong("5"));
        this.authorService.save("Leo", "Tolstoy", Long.parseLong("6"));
        this.authorService.save("Mark", "Twain", Long.parseLong("7"));
        this.authorService.save("Chinua", "Achebe", Long.parseLong("8"));
        this.authorService.save("Yuval", "Noah Harari", Long.parseLong("10"));

        this.bookService.save("Adventures of Huckleberry Finn", Category.NOVEL, Long.parseLong("7"), 12);
        this.bookService.save("King Lear", Category.FANTASY, Long.parseLong("4"), 61);
        this.bookService.save("Nebesna reka", Category.NOVEL, Long.parseLong("1"), 34);
        this.bookService.save("Sapiens: A Brief History of Humankind", Category.HISTORY, Long.parseLong("9"), 21);
        this.bookService.save("Na Drini ćuprija", Category.NOVEL, Long.parseLong("3"), 55);
        this.bookService.save("Julius Caesar", Category.HISTORY, Long.parseLong("4"), 9);
        this.bookService.save("War and Peace", Category.CLASSICS, Long.parseLong("6"), 14);
        this.bookService.save("Life on the Mississippi", Category.BIOGRAPHY, Long.parseLong("7"), 16);
        this.bookService.save("Arrow of God", Category.NOVEL, Long.parseLong("8"), 59);
        this.bookService.save("Hamlet", Category.NOVEL, Long.parseLong("4"), 42);
        this.bookService.save("There Was a Country", Category.HISTORY, Long.parseLong("8"), 7);
        this.bookService.save("Homo Deus", Category.HISTORY, Long.parseLong("9"), 13);
    }
}
