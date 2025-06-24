public class ProvaConversione {
    public static void main(String[] args) {
        int myint = 9;

        double mydouble = myint;
        //casting automatico: int to double

        System.out.println(myint); //outputs 9
        System.out.println(mydouble); //outputs 9.00

        double mydouble2 = 9.78d;
        int myint2 = (int) mydouble2;
        //casting manuale: double to int

        System.out.println(mydouble2); //outputs 9.78
        System.out.println(myint2); //outputs 9



    }
}
