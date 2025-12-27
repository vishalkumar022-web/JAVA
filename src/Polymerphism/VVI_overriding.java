package Polymerphism;

public class VVI_overriding {
     Number show (){
        System.out.println("Parent methods ");
        return 0 ;
    }
}
class child extends VVI_overriding{
    Integer show(){
        System.out.println("CHild class method ");

        return 0 ;

    }

    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}