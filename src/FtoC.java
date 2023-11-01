import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temper: ");
        double temp = input.nextDouble();
        System.out.println("Choose temperature: ");
        char chooseTemp = input.next().charAt(0);

        double finalTemp = 0;
        FtoC hehe = new FtoC();
        switch (chooseTemp) {
            case 'f':
            case 'F':
               finalTemp= hehe.temptoF(temp);
                break;
            case 'C':
            case 'c':
                finalTemp=hehe.temptoc(temp);
                break;
            default:
                System.out.println("Worng temp.");






        }
        System.out.println("Temperature : " + finalTemp);
    }

    public double temptoF(double t) {
        return (t * 9 / 5) + 32;
    }

    public double temptoc(double t) {
        return (t - 32) * 5 / 9;
    }
}

