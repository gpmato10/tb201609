package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by dw on 2016. 9. 3..
 */
public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {

        // D 사의 독자적인 방법으로 Connection을 생성하는 코드.
        return null;
    }
}
