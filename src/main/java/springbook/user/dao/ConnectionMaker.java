package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by dw on 2016. 9. 3..
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
