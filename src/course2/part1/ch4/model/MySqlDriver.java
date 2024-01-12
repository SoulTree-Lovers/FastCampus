package course2.part1.ch4.model;

public class MySqlDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("MySQL DB 접속을 시도합니다.");
    }
}
