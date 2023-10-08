package com.geekster.WeeklyTest3.Controller;

import com.geekster.WeeklyTest3.Model.Book;
import com.geekster.WeeklyTest3.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookServices bookServices;

    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookServices.addBook(book);
    }

    @PutMapping("book/{id}/{newPrice}")
    public String updateBook(@PathVariable String id, @PathVariable String newPrice){
        return bookServices.updateBookInfo(id, newPrice);
    }

    @DeleteMapping("book/{id}")
    public String deleteBook(@PathVariable String id){
        return bookServices.deleteBook(id);
    }

    @GetMapping("book")
    public List<Book> getAllBook(){
        return bookServices.getAllBook();
    }
}
