package pl.hello.dao;

import pl.hello.databaseUtil.DbUtil;
import pl.hello.model.Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntityDao {
    private Connection connection;

    public EntityDao() {
        connection = DbUtil.getConnection();
    }

    public void doInsert(Entity entity) {
        System.out.print("[INSERT in progress] ...\n");
        try {
            connection = DbUtil.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO HIS.TEST (WARTOSC) VALUES (?)");
            st.setDouble(1, entity.getWartosc());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}




