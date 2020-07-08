package service;

import pojo.Books;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/2/5  19:13
 */
public interface BookService {
    //增加一个Book
    int addBook(Books books);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    //查询一本书
    List<Books> queryBookByName(String s);
}
