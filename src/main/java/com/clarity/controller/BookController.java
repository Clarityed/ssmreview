package com.clarity.controller;

import com.clarity.entity.Books;
import com.clarity.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 书籍控制器类
 *
 * @author: clarity
 * @date: 2022年08月09日 11:25
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String allBook(Model model) {
        System.out.println("1");
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        for (Books book : list) {
            System.out.println(book);
        }
        return "allBook";
    }

    @RequestMapping("/toInsertBook")
    public String toInsertBook() {
        return "toInsertBook";
    }

    @RequestMapping("/insertBook")
    public String addBook(Books book) {
        bookService.insertBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(@RequestParam("id") int id, Model model) {
        Books book = bookService.queryBookById(id);
        model.addAttribute("book", book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book) {
        int i = bookService.updateBook(book);
        System.out.println(i);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {
        int i = bookService.deleteBookById(id);
        System.out.println(i);
        return "redirect:/book/allBook";
    }

}
