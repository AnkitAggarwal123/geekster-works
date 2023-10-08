package com.geekster.WeeklyTest3.Services;

import com.geekster.WeeklyTest3.Model.Book;
import com.geekster.WeeklyTest3.Repo.IBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    @Autowired
    IBook book;

    public String addBook(Book newBook) {
        book.save(newBook);
        return "Added Successfully";
    }

    public String updateBookInfo(String id, String newPrice) {
        Book book1 = book.findById(id).orElseThrow();
        book1.setPrice(newPrice);
        return "Updated Successfully";
    }

    public String deleteBook(String id) {
        book.deleteById(id);
        return "return successfully";
    }

    public List<Book> getAllBook() {
        return book.findAll();
    }
}
