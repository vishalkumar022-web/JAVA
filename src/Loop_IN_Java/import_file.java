package Loop_IN_Java;

public class import_file {
    public int factorial(int n){
        int c = 1 ;
        for(int i = 1 ; i<=5 ; i++){
            c = c*i ;
        }
        return c ;

    }

    public static void main(String[] args) {
        import_file sc = new import_file();
        int result = sc.factorial(5);
        System.out.println(result);
    }

}
