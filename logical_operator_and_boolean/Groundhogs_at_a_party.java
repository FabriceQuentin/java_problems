import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int cupNumber = scanner.nextInt();
        boolean wknd = scanner.nextBoolean();
        boolean cupDuringTheWeek = cupNumber >= 10 && cupNumber <=20;//true if cupNumber in in the asked range
        boolean cupDuringWknd = cupNumber >= 15 && cupNumber <= 25;//true if cupNumber in in the asked range
        boolean successParty = (!wknd &&cupDuringTheWeek) || (wknd && cupDuringWknd);/*return true if we are
        in the week or in the weekend and we respect the rules*/
        System.out.println(successParty);
    }
}
