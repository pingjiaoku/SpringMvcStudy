package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class Code {
    // 添加成功
    public static final Integer SAVE_OK = 20011;
    // 删除成功
    public static final Integer DELETE_OK = 20021;
    // 修改成功
    public static final Integer UPDATE_OK = 20031;
    // 查询成功
    public static final Integer GET_OK = 20041;

    // 添加失败
    public static final Integer SAVE_ERR = 20010;
    // 删除失败
    public static final Integer DELETE_ERR = 20010;
    // 修改失败
    public static final Integer UPDATE_ERR = 20010;
    // 查询失败
    public static final Integer GET_ERR = 20010;
}



/*package com.itheima.controller;

        import com.itheima.dao.BookDao;
        import com.itheima.domain.Book;
        import com.itheima.service.BookService;
        import org.apache.ibatis.annotations.*;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @GetMapping
    public Result getAll() {
        Object data = bookService.getAll();
        Integer code = data == null ? Code.GET_ERR : Code.GET_OK;
        String msg = data == null ? "未能查询到数据" : "";
        return new Result(code, data, msg);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Long id) {
        Object data = bookService.getById(id);
        Integer code = data == null ? Code.GET_ERR : Code.GET_OK;
        String msg = data == null ? "未能查询到数据" : "";
        return new Result(code, data, msg);
    }
}*/
