package com.clarity.service.impl;

import com.clarity.entity.Books;
import com.clarity.mapper.BookMapper;
import com.clarity.service.BookService;

import java.util.List;

/**
 * 书籍业务处理实现类
 *
 * @author: clarity
 * @date: 2022年08月09日 9:40
 */
public class BookServiceImpl implements BookService {

    // 调用Mapper层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insertBook(Books book) {
        return bookMapper.insertBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
