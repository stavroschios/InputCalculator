import java.util.Scanner;

public class inputCalc {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers");
        double number;
        double avg ;
        double sum = 0;
        double counter = 0;


            while (scanner.hasNextInt()) {
                number = scanner.nextInt();
                //scanner.nextLine();
                sum += number;
                counter++;
            }


        if (!scanner.hasNextInt()) {
            scanner.close();
        }

        avg = Math.round((double) sum / (double) counter);
        System.out.println("SUM = " + Math.round(sum) + " Average = " + Math.round(avg));


    }
}
