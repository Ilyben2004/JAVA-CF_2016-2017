public class TEST {

public static  void main (String[] args){
    OEns<OEns<String>> ls = new OEns<>() ;
    OEns<String> s = new OEns<>() ;
    s.add("aba");
    s.add("aba");
    OEns<String> ss = new OEns<>() ;
    ss.add("ax");
    ss.add("abb");

    ls.add(s);
    ls.add(ss);
    System.out.println(ls);


}







}
