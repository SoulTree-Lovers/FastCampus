package course2.part1.ch4.model;

// OracleDriver는 Oracle 회사에서 만들어서 제공하면 된다. (Driver)
public class OracleDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("Oracle DB 접속을 시도합니다.");
    }
}
