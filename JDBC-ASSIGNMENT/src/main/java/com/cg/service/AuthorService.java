package com.cg.service;

import com.cg.bean.Author;
import com.cg.dao.AuthorDao;
import com.cg.dao.IAuthorDao;

import java.util.List;

public class AuthorService implements IAuthorService{
    IAuthorDao dao=new AuthorDao();
    @Override
    public  String createAuthor(Author a){
        if(a.getFirstName()==null || a.getPhoneNo()==null){
            return "Invalid Author Data";
        }else{
            return dao.saveAuthor(a);
        }
    }
    @Override
    public List<Author> getAllAuthor() {
        return dao.getAll();
    }
    @Override
    public String updateAuthorName(int authorId, String name) {
        if (name == null || name.length() < 4 )
            return "Invalid Name";
        return dao.updateAuthorName(authorId,name);
    }

    @Override
    public String removeAuthor(int authorId) {
        if (authorId==0)
            return "Inavalid Id";
        return dao.deleteAuthor(authorId);
    }
    @Override
    public List<String> getBooksByAuthor(String name) {
        return dao.getBooksByAuthor(name);
    }

    @Override
    public String updateBookPrice(String name,double price) {
        return dao.updateBookPriceByAuthor(name,price);
    }

}
