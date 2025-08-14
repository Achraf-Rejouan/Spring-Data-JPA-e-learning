package com.achrafrejouan.jpa.repositories;

import com.achrafrejouan.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
