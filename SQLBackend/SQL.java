package SQLBackend;
import java.sql.*;
import java.util.*;  
public class SQL {
    private Vector<Vector> array = new Vector<Vector>();
    private Vector<String> data;

    public Vector<Vector> SQL()
    {
        String connectionUrl =
                "jdbc:sqlserver://dbserverbookzoo.database.windows.net:1433;"
                        + "database=db1;"
                        + "user=username1@dbserverbookzoo;"
                        + "password=testingABCD1234;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";
        ResultSet resultSet = null;
        try (
                Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            String selectSql = "SELECT * FROM userinfo";
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                data = new Vector<String>();
                data.add(resultSet.getString(1));
                data.add(resultSet.getString(2));
                data.add(resultSet.getString(3));
                data.add(resultSet.getString(4));
                array.add(data);
            }
            return array;
        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateData(String col1,String col2,String col3)
    {

        String connectionUrl =
                "jdbc:sqlserver://dbserverbookzoo.database.windows.net:1433;"
                        + "database=db1;"
                        + "user=username1@dbserverbookzoo;"
                        + "password=testingABCD1234;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";
        String insertSql = "INSERT INTO userinfo(FirstName, LastName, ICNumber) VALUES" + "('" + col1 + "','" + col2 +"','" + col3 + "')";
        System.out.println(insertSql);
        try (Connection connection = DriverManager.getConnection(connectionUrl); PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql);)
        {
            prepsInsertProduct.execute();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
