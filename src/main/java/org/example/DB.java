package org.example;

import java.sql.*;

public class DB {
    private static DB instance;
    private static String cstr;
    public static DB getInstance() {
        if (instance == null) instance = new DB();
        return instance;
    }

    public static void dbInit(String connectionString) {
        cstr = connectionString;
    }

    public static Connection getConnection() {
        Connection c = null;
        try {
            c = DriverManager.getConnection(cstr);
        } catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }

    public static void getUsers() throws SQLException {
        PreparedStatement querry = getConnection().prepareStatement("SELECT * FROM Uzivatele;");
        ResultSet result = querry.executeQuery();

        while (result.next()) {
            int id = result.getInt(1);
            String jmeno = result.getString(2) + " " + result.getString(3);
            String mail = result.getString(5);
            System.out.println(id + " | " + jmeno + " | " + mail);
        }
    }

    public static void createUser(String jmeno, String prijmeni) throws SQLException {
        PreparedStatement query = getConnection()
                .prepareStatement("INSERT INTO `Uzivatele` (`Jmeno`, `Prijmeni`, `Heslo`, `Mail`) VALUES (?, ?, ?, ?)");

        String[] mails = {"@seznam.cz", "@gmail.com", "@email.cz", "@post.cz", "@centrum.cz"};

        query.setString(1, jmeno);
        query.setString(2, prijmeni);
        query.setString(3, String.valueOf((jmeno + prijmeni).hashCode()));
        query.setString(4, prijmeni + jmeno + mails[(int) (Math.random() * mails.length)]);

        query.execute();

    }

}
