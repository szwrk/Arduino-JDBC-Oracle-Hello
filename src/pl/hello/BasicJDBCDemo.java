package pl.hello;

import java.sql.*;

    public class BasicJDBCDemo
    {
        Connection conn;

        public static void main(String[] args)
        {
            new BasicJDBCDemo();
        }

        public BasicJDBCDemo()
        {
            try
            {
                String  driver="oracle.jdbc.driver.OracleDriver";
                String url="jdbc:oracle:thin:@192.168.56.102:1521:orcl";
                String user="arek";
                String password="oracle";

                Class.forName(driver).newInstance();
                url = "jdbc:mysql://localhost/coffeebreak";
                conn = DriverManager.getConnection(url, user, password);
                                conn.close();



            }
            catch (ClassNotFoundException ex) {System.err.println(ex.getMessage());}
            catch (IllegalAccessException ex) {System.err.println(ex.getMessage());}
            catch (InstantiationException ex) {System.err.println(ex.getMessage());}
            catch (SQLException ex)           {System.err.println(ex.getMessage());}
        }



        private void doInsertTest()
        {
            System.out.print("\n[Performing INSERT] ... ");
            try
            {
                Statement st = conn.createStatement();
                st.executeUpdate("INSERT INTO TEST " +
                        "VALUES (6, 'test')");
            }
            catch (SQLException ex)
            {
                System.err.println(ex.getMessage());
            }
        }

            }
}
