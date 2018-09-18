package mapper;

import entity.User;

import java.util.List;

public interface UserMapper {

    User findUserById(int id);
   /* List<User> findUserAll();
    void inserUser(Integer id, String name);*/
}
