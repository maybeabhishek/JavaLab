public class q3{
    public static void main(String[] args) {
        int population = 1000;
        float percIncrease = 10;
        System.out.println("Current Population: "+ population);
        int i =0;
        while(population<30000){
        
            population+=population*10/100;
            System.out.println("Population after "+ ++i + " year is: "+ population);
        }

    }
}