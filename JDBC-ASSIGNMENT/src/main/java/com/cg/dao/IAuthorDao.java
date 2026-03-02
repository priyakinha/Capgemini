package com.cg.dao;

import com.cg.bean.Author;

import java.util.List;

public interface IAuthorDao {
    public String saveAuthor(Author a);
    public List<Author> getAll();
    public String updateAuthorName(int authorId,String newName);
    public String deleteAuthor(int authorId);
    List<String> getBooksByAuthor(String firstName);

    String updateBookPriceByAuthor(String firstName, double newPrice);
}
