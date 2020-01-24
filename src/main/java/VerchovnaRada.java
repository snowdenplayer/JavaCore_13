import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerchovnaRada {
    private List<Frakcija> rada= new ArrayList< >();
    private static VerchovnaRada verchovnaRada;
    Scanner in = new Scanner(System.in);

    public static VerchovnaRada getInstance(){
        if (verchovnaRada == null){
            verchovnaRada = new VerchovnaRada();
        }
        return verchovnaRada;
    }

    public void addFrakcja(){

        System.out.println("Enter name of frrakcja");
        Frakcija f = new Frakcija(in.next());
        rada.add(f);
        System.out.println("Frakcja has been added");
    }
    public void removeFrakcja(){

        System.out.println("Enter which one you want to delete");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getFrakcija().equalsIgnoreCase(name)){
                iterator.remove();
                System.out.println(name + " has succsesfuly deleted");
            }
        }
    }
    public void showAllFrakcja(){
        Iterator<Frakcija> iterator = rada.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void showFrakcja(){
        System.out.println("Enter which one you want to watch");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getFrakcija().equalsIgnoreCase(name)) {
                System.out.println(iterator.next());
            }
        }
    }

    public void addDeputatToFrakcja(){
        System.out.println("Введи фракцию в котоую хочешь добавить");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        while (iterator.hasNext()){
            Frakcija frakcija = iterator.next();
            if(frakcija.getFrakcija().equalsIgnoreCase(name)){
                frakcija.addDeput();
            }
        }
    }

    public void deleteDeputatToFrakcja(){
        System.out.println("Введи фракцию с которой хочешь удалить");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        while (iterator.hasNext()){
            Frakcija frakcija = iterator.next();
            if(frakcija.getFrakcija().equalsIgnoreCase(name)){
                frakcija.deleteDeputat();
            }
        }
    }

    public void showHabarnykivDeputatToFrakcja(){
        System.out.println("Введи фракцию в которой хочешь найти хабарников");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        while (iterator.hasNext()){
            Frakcija frakcija = iterator.next();
            if(frakcija.getFrakcija().equalsIgnoreCase(name)){
                frakcija.showHabarnykiv();
            }
        }

    }
    public void showTheBiggestHabarnykivDeputatToFrakcja(){
        System.out.println("Введи фракцию в котоую хочешь найти босса хабая");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        while (iterator.hasNext()){
            Frakcija frakcija = iterator.next();
            if(frakcija.getFrakcija().equalsIgnoreCase(name)){
                frakcija.BiggestDiller();
            }
        }
    }

    public void showAllDeputatToFrakcja(){
        System.out.println("Enter which one you want to watch");
        String name = in.next();
        Iterator<Frakcija> iterator = rada.iterator();
        Exist(name).showAllDeputats();
       /* while(iterator.hasNext()){
            if(iterator.next().getFrakcija().equalsIgnoreCase(name)) {
                iterator.next().showAllDeputats();
            }
        }*/
    }

    public Frakcija Exist(String name){

        Iterator<Frakcija> iterator = rada.iterator();
        while(iterator.hasNext()){
            Frakcija fr = iterator.next();
            if(fr.getFrakcija().equalsIgnoreCase(name)){
                return fr;
            }

        }
        return null;

    }



}
