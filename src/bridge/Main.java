package bridge;

public class Main {
    public static void main(String[] args) {
//        PrintMorseCode printMorseCode = new PrintMorseCode(new DefaultMorseCodeFunction());
//        PrintMorseCode printMorseCode = new PrintMorseCode(new SoundMorseCodeFunction());
        PrintMorseCode printMorseCode = new PrintMorseCode(new FlashMorseCodeFunction());
        printMorseCode.g().a().r().a().m();
    }
}
