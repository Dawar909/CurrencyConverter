import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Float dollarconverter;
        Float rupeeconverter;
        Float poundconverter;
        Float yenconverter;
        Float euroconverter;
        int choice;
        System.out.println("1.USD to INR\n2.USD to GBP\n3.USD to JPY\n4.USD to EUR\n5.INR to USD\n6.INR to GBP\n7.INR to JPY\n8.INR to EUR\n9.GBP to USD\n10.GBP to INR\n11.GBP to JPY\n12.GBP to EUR\n13.JPY to USD\n14.JPY to INR\n15.JPY to GBP\n16.JPY to EUR\n17.EUR to USD\n18.EUR to INR\n19.EUR to JPY\n20.EUR to GBP");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Enter how many dollars");
                dollarconverter = scanner.nextFloat();
                System.out.println(dollarconverter * 86.58);
        }
    }
}