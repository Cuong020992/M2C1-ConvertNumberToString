import java.util.Scanner;

public class ConvertNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần đọc: ");
        int number = sc.nextInt();

        String[] unit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] aboveTen = {"ten", "eleven", "twelve", "thirdteen", "fourteen", "fifthteen", "sixteen", "seventeen", "eightteen", "nineteen"};
        String[] dozen = {"twenty-", "thirty-", "forty-", "fifty-", "sixty-", "seventy-", "eighty-", "ninety-"};
        String[] hundred = {"one hundred-", "two hundred-", "three hundred-", "four hundred-", "five hundred-", "six hundred-", "seven hundred-", "eight hundred-", "nine hundred-"};

        if (number < 10 && number > 0) {
            System.out.println("Số đọc là: " + unit[number - 1]);
        }
        if (number >= 10 && number <= 19) {
            System.out.println("Số đọc là: " + aboveTen[number - 10]);
        }
        if (number >=20 && number <= 99){
            int unitNumber = number % 10;
            int dozenNumber = (number-unitNumber)/10;
            System.out.println("Số đọc là: "+dozen[dozenNumber-2]+unit[unitNumber-1]);
        }
        if(number >=100 && number <=999){
            int unitNumber = (number % 100) % 10;
            int dozenNumber = (number%100-unitNumber)/10;
            int hundredNumber = (number - dozenNumber*10 - unitNumber) /100;
            System.out.println("Số đọc là: "+hundred[hundredNumber-1]+dozen[dozenNumber-2]+unit[unitNumber-1]);
        }
    }
}