package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.SQLException;

/**
 * Created by dw on 2016. 9. 3..
 */
public class UserDaoTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + "이란 아이디 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "라는 아이디를 조회 성공함.");
    }
}
