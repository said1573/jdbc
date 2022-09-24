package hello.jdbc.connection;

// 상수만 모아두었기 때문에 객체로 생성하지 않기 위해 추상 클래스로 만듦
public abstract class ConnectionConst {
    public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String USERNAME = "SA";
    public static final String PASSWORD = "";
}
