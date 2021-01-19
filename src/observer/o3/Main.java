package observer.o3;

public class Main {
    public static void main(String[] args) {
        // 1. 제네릭
        // 2. 델리게이터
        // 3. 내부에 옵저버 넣음
        Button button = new Button();
        button.addObserver((o, arg) -> System.out.println(o + " is Clicked"));

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
