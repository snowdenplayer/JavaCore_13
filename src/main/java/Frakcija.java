import java.util.*;

public class Frakcija {
    private String frakcija;
    private List<Deputat> spusok = new ArrayList<>();

    public Frakcija(String frakcija) {
        this.frakcija = frakcija;
    }

    public String getFrakcija() {
        return frakcija;
    }

    public void setFrakcija(String frakcija) {
        this.frakcija = frakcija;
    }


    public List<Deputat> getSpusok() {
        return spusok;
    }

    public void setSpusok(List<Deputat> spusok) {
        this.spusok = spusok;
    }

    public void addDeput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of deputat");
        String name = input.next();
        System.out.println("SirName of deputat");
        String sirname = input.next();
        System.out.println("Age of deputat");
        int age = input.nextInt();
        System.out.println("Habarnyk of deputat(true/false)");
        boolean habr = input.nextBoolean();
        System.out.println("Weight of deputat");
        Double weight = input.nextDouble();
        System.out.println("Height of deputat");
        Double height = input.nextDouble();
        Deputat fr = new Deputat(weight, height, name, sirname, age, habr);
        if (habr) {
            fr.giveBribe(fr.isHabr());
        }

        spusok.add(fr);
        System.out.println("Member of Parliament " + name + " " + sirname + " has been just added.");
    }

    public void deleteDeputat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of deputat");
        String name = input.next();
        System.out.println("SirName of deputat");
        String sirname = input.next();
        Iterator<Deputat> iterator = spusok.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name) && iterator.next().getSirName().equalsIgnoreCase(sirname)) {
                System.out.println(iterator.next().getName() + " " + iterator.next().getSirName() + " has been deleted !");
                iterator.remove();

            } else {
                System.out.println("No deputat");
            }
        }


    }
    /*public void showHabarnykiv(){
        Iterator<Deputat> iterator = spusok.iterator();
        while(iterator.hasNext()){
            if(iterator.next().isHabr()){
                System.out.println(iterator.next().toString());
            }
        }

    }*/
    public void showHabarnykiv() {
        ListIterator<Deputat> deputyIterator = spusok.listIterator();

        while (deputyIterator.hasNext()) {
            System.out.println(deputyIterator.next());
        }
    }

    public void BiggestDiller(){
        Iterator<Deputat> iterator = spusok.iterator();
        Collections.sort(spusok, new SizeHabrComparator());
        System.out.println("The most corrupt deputy is "+spusok.get(1).getName()+" "+spusok.get(1).getSirName());

    }
    public void showAllDeputats(){
        Iterator<Deputat> iterator = spusok.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void deleteAllDeputats(){
        spusok.clear();
    }

    @Override
    public String toString() {
        return "Frakcija{" +
                "frakcija='" + frakcija + '\'' +
                '}';
    }

}
