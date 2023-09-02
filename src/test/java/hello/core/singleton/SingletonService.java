package hello.core.singleton;

public class SingletonService {
    //static으로 선언해서, 클래스 레벨에 올라가 딱 하나만 존재하게 됨
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    //기본 생성자를 private로 선언하면 다른 곳에서 new로 초기화 불가
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
