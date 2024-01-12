package course2.part1.ch4.model;

public class MsSqlDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("MsSQL DB 접속을 시도합니다.");
    }
}
