package com.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.entities.Book;

public interface BookRep extends JpaRepository<Book, Integer> {
}
