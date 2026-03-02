package com.cg.service;

import com.cg.bean.Book;
import com.cg.dao.BookDao;
import com.cg.dao.IBookDao;

public class BookService implements IBookService{
    IBookDao dao = new BookDao();

    @Override
    public String createBook(Book b) {
        return dao.saveBook(b);
    }
}
