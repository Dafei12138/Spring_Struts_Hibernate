package com.ssh.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.data.entity.Book;
import com.ssh.data.service.ICatService;
import com.ssh.data.service.impl.CatServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookAction extends ActionSupport {

    private static ICatService catService = new CatServiceImpl();

    public List<Book> bookList = new ArrayList<Book>();

    private String title;
    private Book book;

    public String initAdd(){
        return "initAdd";
    }

    public String add(){
        bookList.add(book);
        title = "<br/><br/>添加书籍成功<br/><br/>";
        return "success";
    }

    public String list(){
        String name = catService.findNameById(1);
        System.out.println("******************" + name);
        bookList.add(new Book("java开发" , "李刚" , new Date()));
        return "list";
    }

    public String clear(){
        bookList.clear();
        title = "<br/><br/>清空书籍成功<br/><br/>";
        return "list";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
