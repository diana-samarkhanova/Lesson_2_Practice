//multiplication table
public class Practice5 {
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){ //rows
            for(int k = 1; k < 10; k++){ //columns
                System.out.print(i*k+ "\t");
            }
            System.out.println();
        }
    }
}
