import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            //System.out.println(isCorrectInput(new Scanner(System.in).nextLine()));
            System.out.println(calc(new Scanner(System.in).nextLine()));
        }
    }
    public static String calc(String input) {
        if (isCorrectInput(input)) {
        int i = 0;
        StringBuilder a = new StringBuilder();
        a.append(input.charAt(i));
          while (i<2)
            switch (input.charAt(i+1)) {
                case '+':String s = a.toString();
                String s1 = input.substring(i+2);
                    return Integer.toString(Integer.parseInt(s) + Integer.parseInt(s1));
                case '-':
                    return Integer.toString(Integer.parseInt(a.toString()) - Integer.parseInt(input.substring(i+2)));
                case '/':
                    return Integer.toString(Integer.parseInt(a.toString()) / Integer.parseInt(input.substring(i+2)));
                case '*':
                    return Integer.toString(Integer.parseInt(a.toString()) * Integer.parseInt(input.substring(i+2)));
                default: i++; a.append(input.charAt(i)); //continue;
            }
        } else if (isException1(input)) {
            throw new RuntimeException("//т.к. строка не является математической операцией");
        } else if (isException2(input)) {
            throw new RuntimeException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return "Не предвиденная ошибка";
    }
    static Boolean isCorrectInput(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9|10)(\\+|-|/|\\*)(1|2|3|4|5|6|7|8|9|10)$");
    }
    static Boolean isException1(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9|10)$");

    }
    static Boolean isException2(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9|10)(\\+|-|/|\\*)(1|2|3|4|5|6|7|8|9|10)(\\+|-|/|\\*)(1|2|3|4|5|6|7|8|9|10)$");

    }
}
