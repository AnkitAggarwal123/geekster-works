package com.geekster.WeeklyTest3.Repo;

import com.geekster.WeeklyTest3.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBook extends JpaRepository<Book, String> {
}
