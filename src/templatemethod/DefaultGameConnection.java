package templatemethod;

public class DefaultGameConnection extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String str) {
//        System.out.println("디코드");
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return str;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 / 암호 확인");
        return true;
    }

    @Override
    protected int authorization(String userName) {
//        System.out.println("권한 확인");
        System.out.println("밤10시 이후 나이 확인하여 권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속단계!!");
        return info;
    }
}
