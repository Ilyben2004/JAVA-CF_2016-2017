import java.util.*;
import java.util.LinkedList;
import  java.util.function.Predicate;
import java.util.stream.Collectors;

public class OEns <T extends Comparable <? super  T>> extends LinkedList<T> implements Comparable<OEns<T>> {

    Pair<Integer, Boolean> localiser(T o) {
        return new Pair<>(this.indexOf(o), this.contains(o));
    }

    public boolean add(T o) {
        if(this.isEmpty()){
            super.add(o);  // Call the superclass's add method to add the element
            return true;
        }

        if (!this.contains(o)) {
            super.add(o);  // Call the superclass's add method to add the element
            Collections.sort(this);
            return true;
        }

        return false;
    }


    T max() {
        // THE COLLECTION ALREADY SORTED SO ALL WHAT WE NEED TO DO IS TO GET THE LAST ELEMENT HAHAHAHAHAHAHAHAHAH
        return this.get(this.size() - 1);
    }


    // predicate ?????????????????????????
// anyway
    // an example of Peridicate
    // Perdicate <Student > p = student -> student,getage()>15 ;
    // boolean x = p.test(student1) ;
    public OEns<T> filtrer(Predicate<T> p){

        return (OEns<T>) this.stream().filter(p).toList();
    }

    public OEns<T> pgpc(OEns<T> t) {
        OEns<T> ill_return = new OEns<>();
        List<T> sub = new ArrayList<>();

        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < t.size(); j++) {
                int k = 0;
                while (i + k < this.size() && j + k < t.size() && this.get(i + k).equals(t.get(j + k))) {
                    k++;
                }
                if (k > sub.size()) {
                    sub = this.subList(i, i + k);
                }
            }
        }

        ill_return.addAll(sub);
        return ill_return;
    }


    public  Pair<OEns<T>,OEns<T>> restes( OEns<T> e ){

        LinkedList<T> toremove = this.pgpc(e);

        LinkedList<T>  l1= new LinkedList<>(this);
        LinkedList<T>  l2= new LinkedList<>(e);
        l1.removeAll(toremove);
        l2.removeAll(toremove);
        OEns<T> illReturn1 = new OEns<>();
        illReturn1.addAll(l1);
        OEns<T> illReturn2 = new OEns<>();
        illReturn2.addAll(l2);



return  new Pair<>(illReturn1,illReturn2);


    }

    @Override
    public int compareTo(OEns<T> o) {
        Pair <OEns<T>,OEns<T>> pair = this.restes(o);
        if(pair.getFirst().isEmpty() || pair.getSecond().isEmpty() )  return 1;
        return pair.getFirst().get(0).compareTo(pair.getSecond().get(0));
    }
}



// iterateur explicite iterator w iterateur implicite huwa foreach( for(Objecy o : collection 0))
