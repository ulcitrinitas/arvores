package arvores;

public class Pprint {

    public static void genDecorations(int size){

        int count = 0;

        do {
            
            System.out.print("=-");

            count++;

        } while (count != size);

        System.out.println("");

    }
}