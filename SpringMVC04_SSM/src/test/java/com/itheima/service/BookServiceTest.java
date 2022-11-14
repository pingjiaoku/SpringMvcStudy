package com.itheima.service;


import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book byId = bookService.getById(1L);
        System.out.println(byId);
    }

    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("阿迪斯发第三方");
        book.setType("json测试");
        book.setDescription("嘎哈而哈哈听哈&*……（*&……（&13");
        bookService.save(book);
    }
}
