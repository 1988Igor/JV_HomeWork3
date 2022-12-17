package org.example;

//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг,
// в которых простое количество страниц,
// фамилия автора содержит «А» и год издания не позднее 2010 г.

import java.util.*;

import static org.example.Primecheck.checkPrime;


public class MainTask3 {

    public static void main(String[] args) {
        Task3();

    }

    private static void Task3() {


        BooksTask3 book1 = new BooksTask3("Hello World", "Alistov", 125.00, 1954, 71);
        BooksTask3 book2 = new BooksTask3("I love Java", "Antonov", 340.00, 1960, 11);
        BooksTask3 book3 = new BooksTask3("xxxx", "Maximov", 500.00, 1970, 200);
        BooksTask3 book4 = new BooksTask3("Java love me", "Andreev", 730.00, 2009, 23);
        BooksTask3 book5 = new BooksTask3("eeee", "PetrovA", 100.00, 2010, 18);
        BooksTask3 book6 = new BooksTask3("llll", "Ivanov", 7500.00, 1999, 115);

        List<BooksTask3> listBooks = new ArrayList<>();

        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);
        listBooks.add(book5);
        listBooks.add(book6);

        int result;
        boolean bol = true;

        System.out.println("Книги в которых простое количество страниц,\n" +
                "фамилия автора содержит «А» и год издания не позднее 2010 г.: ");
        for (BooksTask3 books : listBooks) {
            result = books.getNumbers_of_pages();
            for (int i = 2; i < result; i++) {
                if (result % i == 0) {
                    bol = false;
                    break;
                } else {
                    bol = true;
                }
            }
            if ((bol) && books.getAuthor_name().contains("A") && (books.getPublication_year() <= 2010))


                System.out.println(books.getBooks_name());
        }

    }

}







