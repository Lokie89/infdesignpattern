package templatemethod;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String str);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    // 템플릿 메서드
    public String requestConnection(String encodedInfo) {
        // 보안 작업 -> 암호화 된 문자열을 디코드
        String decodedInfo = doSecurity(encodedInfo);

        // doSecurity 반환된 데이터를 아이디, 암호를 빼냄
        String id = "aaa";
        String password = "bbb";


        // 인증 작업 ->
        boolean isAuthenticated = authentication(id, password);
        if (!isAuthenticated) {
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";

        // 권한 작업 ->
        int i = authorization(userName);

        switch (i) {
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한 없음");
                break;
            default:
                System.out.println("기타 상황");
                break;
        }

        return connection(decodedInfo);
    }
}
