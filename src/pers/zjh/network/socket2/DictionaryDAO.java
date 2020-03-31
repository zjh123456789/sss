package pers.zjh.network.socket2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DictionaryDAO {

    public DictionaryDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/socket?characterEncoding=UTF-8","root","admin");
    }

    public List<Dictionary> query(String s) {
        List<Dictionary> dictionaries = new ArrayList<Dictionary>();
        String sql = "select * from dictionary where receive = ? ";

        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Dictionary dictionary = new Dictionary();
                int id = resultSet.getInt(1);
                String receive = resultSet.getString("receive");
                String respopnse = resultSet.getString("response");
                dictionary.id = id;
                dictionary.receive = receive;
                dictionary.response = respopnse;
                dictionaries.add(dictionary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dictionaries;
    }
}
