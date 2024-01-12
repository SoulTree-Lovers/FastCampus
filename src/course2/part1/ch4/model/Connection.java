package course2.part1.ch4.model;

public interface Connection {
    // 데이터베이스 연결 동작
    public void getConnection(String url, String username, String password);
}
