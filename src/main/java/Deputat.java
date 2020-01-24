import java.util.Scanner;

public class Deputat extends Person {
    private String name;
    private String sirName;
    private int age;
    private boolean habr;
    private int inthabr;


    public Deputat(double weight, double height, String name, String sirName, int age, boolean habr) {
        super(weight, height);
        this.name = name;
        this.sirName = sirName;
        this.age = age;
        this.habr = habr;
    }

    public void habar(){
        if(!this.habr){
            System.out.println("Dont put habariv");
        }else{
            Scanner in = new Scanner(System.in);
            System.out.print("Specify the amount of your bribe: ");
            int size = in.nextInt();
            if(size>5000){
                System.out.print("This MP will be arrested");
            }else{
                this.inthabr = size;
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHabr() {
        return habr;
    }

    public void setHabr(boolean habr) {
        this.habr = habr;
    }

    public int getInthabr() {
        return inthabr;
    }

    public void setInthabr(int inthabr) {
        this.inthabr = inthabr;
    }


    public void giveBribe(boolean isGrafter) {
        if (!isGrafter) {
            System.out.println("This deputy doesn't take a bribe !");
        } else {
            System.out.println("Enter size of bribe !");
            Scanner scanner = new Scanner(System.in);
            int inputSizeOfBribe = scanner.nextInt();
            System.out.println("Size of bribe: " + inputSizeOfBribe);
            if (inputSizeOfBribe > 5000) {
                System.out.println("The police imprison the deputy !");
            } else {
                setInthabr(inputSizeOfBribe);
            }
        }
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", sirName='" + sirName + '\'' +
                ", age=" + age +
                ", habr=" + habr +
                ", inthabr=" + inthabr +
                '}';
    }
}
