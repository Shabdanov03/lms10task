import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(contains(scanner.nextInt(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15));
            }
            static boolean contains(int a, int... varargs) {
                for (int number : varargs) {
                    if (a == number) {
                        return true;
                    }
                }
                return false;
            }
        }

