package com.clarity.mapper;

import com.clarity.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // 添加一本书籍
    int insertBook(Books book);

    // 通过id删除一本书籍
    int deleteBookById(@Param("id") int id);

    // 更新书籍
    int updateBook(Books book);

    // 根据id删除书籍
    Books queryBookById(@Param("id") int id);

    // 查询所有书籍
    List<Books> queryAllBook();

}
