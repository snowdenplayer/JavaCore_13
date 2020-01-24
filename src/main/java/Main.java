import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VerchovnaRada rada =  VerchovnaRada.getInstance();

        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.println();
            System.out.println("Сhoose any option entering its corresponding number:");
            System.out.println("1 - додати фракцію");
            System.out.println("2 - видалити конкретну фракцію");
            System.out.println("3 - вивести всі фракції");
            System.out.println("4 -очистити конкретну фракцію");
            System.out.println("5 - вивести конкретну фракцію");
            System.out.println("6 - додати депутата в фракцію");
            System.out.println("7 - видалити депутата з фракції");
            System.out.println("8 - вивести список хабарників");
            System.out.println("9 - вивести найбільшого хабарника");
            int optionNumber = in.nextInt();
            switch (optionNumber){
                case 1:
                    rada.addFrakcja();
                    break;
                case 2: rada.removeFrakcja();
                    break;
                case 3: rada.showAllFrakcja();
                    break;
                case 4: rada.deleteDeputatToFrakcja();
                    break;
                case 5:
                    rada.showAllDeputatToFrakcja();
                    break;
                case 6: rada.addDeputatToFrakcja();
                    break;
                case 7: rada.deleteDeputatToFrakcja();
                    break;
                case 8: rada.showHabarnykivDeputatToFrakcja();
                    break;
                case 9: rada.showTheBiggestHabarnykivDeputatToFrakcja();
                    break;
                default: System.out.println("Thank you for using our system!");
                    flag = true;
            }
        }
    }
}
