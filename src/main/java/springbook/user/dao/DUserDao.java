package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by dw on 2016. 9. 3..
 */
public class DUserDao extends UserDao {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // D 사 DB Connection 생성코드
        return null;
    }
}
