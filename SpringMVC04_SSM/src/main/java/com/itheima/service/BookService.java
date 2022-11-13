package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookService {

    /**
     * 添加
     */
    @Transactional
    boolean save(Book book);

    /**
     * 按id删除
     */
    @Transactional
    boolean delete(Long id);

    /**
     * 按id修改
     */
    @Transactional
    boolean update(Book book);

    /**
     * 按id查询
     */
    List<Book> getAll();

    /**
     * 查询所有
     */
    Book getById(Long id);
}
