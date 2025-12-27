package test;

public class Show {




        void Multiple_check(int a , int b , int n ){
            int num = a ;
            int Deno = b ;
            int arr[] = new int[5];

            try {
                int res =  num/Deno ;
                System.out.println(res);
                System.out.println(arr[n]);
            }
            catch (ArithmeticException e ){
                System.out.println("Any number can't Divided by Zero ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid INdex is Given ");
            }
        }
        Show(int x , int y , int z ){
            this.Multiple_check(x,y,z);
        }

        public static void main(String[] args) {
          Show sc = new Show(10,0,10);

        }
    }


