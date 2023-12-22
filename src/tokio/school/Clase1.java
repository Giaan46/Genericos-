package tokio.school;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Clase1 {
    public static void main(String [] args){
        List<Integer> lista = new ArrayList<>();
        Iterator it = lista.iterator();
        lista.add(new Random().nextInt(1000));
        lista.add(new Random().nextInt(1000));
        lista.add(new Random().nextInt(1000));
        lista.add(new Random().nextInt(1000));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
        System.out.println("--------------");
        System.out.println(it.next());

        {
        }
    }
}
