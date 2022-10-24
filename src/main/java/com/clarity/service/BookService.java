package com.clarity.service;

import com.clarity.entity.Books;

import java.util.List;

// BookService：底下需要去实现，调用Mapper层
public interface BookService {

    // 添加一本书籍
    int insertBook(Books book);

    // 通过id删除一本书籍
    int deleteBookById(int id);

    // 更新书籍
    int updateBook(Books book);

    // 根据id删除书籍
    Books queryBookById(int id);

    // 查询所有书籍
    List<Books> queryAllBook();

}
