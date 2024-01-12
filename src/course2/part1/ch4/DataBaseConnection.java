package course2.part1.ch4;

import course2.part1.ch4.model.Connection;
import course2.part1.ch4.model.MsSqlDriver;
import course2.part1.ch4.model.MySqlDriver;
import course2.part1.ch4.model.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        // Oracle DB 접속 예시
        Connection connection1 = new OracleDriver();
        connection1.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

        // MySQL DB 접속 예시
        Connection connection2 = new MySqlDriver();
        connection2.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");

        // MsSQL DB 접속 예시
        Connection connection3 = new MsSqlDriver();
        connection3.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem", "root", "1234");

    }
}
