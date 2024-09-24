import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int num = 56;
        LinkedList<Integer> binario = new LinkedList<>();

        while (num > 0) {
            binario.addFirst(num % 2);
            num = num / 2;
        }
        System.out.println(binario);
    }
}
