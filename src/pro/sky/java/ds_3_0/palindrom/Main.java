package pro.sky.java.ds_3_0.palindrom;

public class Main {
    public static void main(String[] args) {
        String text = "AbcdeeEdcba";
        System.out.println(isPalindrome(text));
        System.out.println(isPalindromeSb(text));
        if (isPalindrome(text)) {
            System.out.println("Строка " + text + " является палиндромом");
        } else {
            System.out.println("Строка " + text + " не является палиндромом");
        }
    }

    //Метод проверки строки на палиндром путем сравнения символов от начала с символами от конца строки
    public static boolean isPalindrome(String line) {
        char[] charLine = line.toLowerCase().toCharArray();
        int start = 0;
        int end = charLine.length - 1;
        while (start < end) {
            if (charLine[start] != charLine[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Метод проверки строки на палиндром с использованием метода из класса StringBuilder
    public static boolean isPalindromeSb(String line) {
        String lowerCaseLine = line.toLowerCase();
        String reverseLine = new StringBuilder(lowerCaseLine).reverse().toString();
        return lowerCaseLine.equals(reverseLine);
    }
}
