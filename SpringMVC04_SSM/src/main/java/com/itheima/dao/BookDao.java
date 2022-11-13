package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    @Insert("insert into tbl_book values (null, #{type}, #{name}, #{description})")
    void save(Book book);

    @Delete("delete from tbl_book where id=#{id}")
    void delete(@Param("id") Long id);

    @Update("update tbl_book set type=#{type}, name=#{name}, description=#{description} where id=#{id}")
    void update(Book book);

    @Select("select * from tbl_book")
    List<Book> getAll();

    @Select("select * from tbl_book where id=#{id}")
    Book getById(@Param("id") Long id);

}
