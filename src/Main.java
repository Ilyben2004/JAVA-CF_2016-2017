// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        OEns<Integer> l1 = new OEns<>();

        OEns<Integer> l2 = new OEns<>();


        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);



        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(10);
        l2.add(11);
        l2.add(12);


        OEns<Integer> l3 = l2.pgpc(l1);

        for(Integer I : l3){
            System.out.println(I);
        }
Pair <OEns<Integer> , OEns<Integer> > pair = l1.restes(l2);
        System.out.println("*********************** first litst ");
        for(Integer I : pair.getFirst()){
            System.out.println(I);
        }

        System.out.println("*********************** second litst ");
        for(Integer I : pair.getSecond()){
            System.out.println(I);
        }









    }
    }
