//Country with a 10 million population, 14/1000 birth rate, 8/1000 death rate. The population in 10 years.
public class Practice1 {
    public static void main(String[] args) {
        int population = 10000000;
        int birth = 14; //per 1000, constant
        int death = 8; // per 1000, constant
        int year = 1;

        while (year <= 10){
            population += population*(birth-death)/1000;
            year ++;
        }
        System.out.println("Population after 10 years is " + population);
    }
}