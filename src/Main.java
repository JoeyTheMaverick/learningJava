//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String text = "Hello world, I am a developer";

        String real = text.replace(",","");

        String[] words = real.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.printf(words[i]+" ");
        }
    }
}