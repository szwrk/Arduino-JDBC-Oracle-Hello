package pl.hello.entity;

import java.sql.*;

import static pl.hello.databaseUtil.DbUtil.*;

public class EntityDao{


    public void addPomiar(String tekst) throws SQLException {

        Connection connection= getConnection();
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM test");
        while (result.next()){
            tekst = result.getString("tekst");

        }
        connection.close();


    }
}
