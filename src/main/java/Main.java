import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
             System.out.println(calc(new Scanner(System.in).nextLine()));
        }
    }
    public static String calc(String input) {
        String str = input.replaceAll(" ","");
        if (isCorrectInput(str)) {
        int i = 0;
        StringBuilder a = new StringBuilder();
        a.append(str.charAt(i));
          while (i<2)
            switch (str.charAt(i+1)) {
                case '+':String s = a.toString();
                String s1 = str.substring(i+2);
                    return Integer.toString(Integer.parseInt(s) + Integer.parseInt(s1));
                case '-':
                    return Integer.toString(Integer.parseInt(a.toString()) - Integer.parseInt(str.substring(i+2)));
                case '/':
                    return Integer.toString(Integer.parseInt(a.toString()) / Integer.parseInt(str.substring(i+2)));
                case '*':
                    return Integer.toString(Integer.parseInt(a.toString()) * Integer.parseInt(str.substring(i+2)));
                default: i++; a.append(str.charAt(i)); //continue;
            }
        } else if (isException1(str)) {
            throw new RuntimeException("т.к. строка не является математической операцией");
        } else if (isException2(str)) {
            throw new RuntimeException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else if (isException3(str)&&!isCorrectInput(str)) {
            throw new RuntimeException("т.к Калькулятор умеет работать только с целыми числами от 1 до 10");

        }else {throw new RuntimeException("Данная операция не возможна т.к. не предусмотрена калькулятором");}
        return "Не предвиденная ошибка";
    }
    static Boolean isCorrectInput(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9|10)(\\+|-|/|\\*)(1|2|3|4|5|6|7|8|9|10)$");
    }
    static Boolean isException1(String s) {
        return s.matches("(\\d*)$")||s.matches("(\\w*)$");

    }
    static Boolean isException2(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9|10)(\\+|-|/|\\*)(1|2|3|4|5|6|7|8|9|10)(\\+|-|/|\\*)(1|2|3|4|5|6|7|8|9|10)$");

    }
    static Boolean isException3(String s) {
        return s.matches("(\\d+(?:\\.\\d+)?)\\s*([-+*\\/])\\s*(-?\\d+(?:\\.\\d+)?)$");
    }
}
