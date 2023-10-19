package com.geekster.Restaurant.App.Repo;

import com.geekster.Restaurant.App.Model.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<Tokens, Integer> {
    Tokens findFirstByTokenValue(String tokenValue);
}
