package observer.o1;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(button1 -> System.out.println(button1 + " is Clicked"));
        button.onClick();
    }
}