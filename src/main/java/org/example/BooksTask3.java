package org.example;

public class BooksTask3 {
    private String books_name;
    private String author_name;
    private Double books_price;
    private Integer publication_year;

    public BooksTask3(String books_name, String author_name, Double books_price, Integer publication_year, Integer numbers_of_pages) {
        this.books_name = books_name;
        this.author_name = author_name;
        this.books_price = books_price;
        this.publication_year = publication_year;
        this.numbers_of_pages = numbers_of_pages;
    }

    public String getBooks_name() {
        return books_name;
    }

    public void setBooks_name(String books_name) {
        this.books_name = books_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Double getBooks_price() {
        return books_price;
    }

    public void setBooks_price(Double books_price) {
        this.books_price = books_price;
    }

    public Integer getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(Integer publication_year) {
        this.publication_year = publication_year;
    }

    public Integer getNumbers_of_pages() {
        return numbers_of_pages;
    }

    public void setNumbers_of_pages(Integer numbers_of_pages) {
        this.numbers_of_pages = numbers_of_pages;
    }

    private Integer numbers_of_pages;
}
