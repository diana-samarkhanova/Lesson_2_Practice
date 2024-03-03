/* Country with a 10 million population, 14/1000 birth rate, 8/1000 death rate.
Every year one person is born and dies less than in the previous year.
Calculate what the population will be in 10 years.
The birth rate cannot be less than 7 people per 1000 people.
The mortality rate cannot be less than 6 people per 1000 people.
 */
public class Practice2 {
    public static void main(String[] args) {
        int population = 10000000;
        int birth = 14; //per 1000, not constant, -1 each year, not less 7
        int death = 8; // per 1000, not constant, -1 each year, not less 6

        for(int year = 1; year <= 10; year ++){
            if(birth > 7) {
                birth --;
            }
            if(death > 6){
                death --;
            }

            population += population*(birth-death)/1000;


        }
        System.out.println("Population after 10 years is " + population);


    }
}
