package Challenges;

import java.util.Arrays;

public class CarRace {
	public int carFleet(int target, int[] position, int[] speed) {
        int fleets = 0;
        CarLS[] cars= new CarLS[position.length];
        for(int i=0; i<position.length; i++){
            cars[i] =  new CarLS(position[i], speed[i]);
        }
        Arrays.sort(cars);
        double currentTime = 0;
        
        for(int i = 0; i<cars.length; i++){
            int s =  cars[i].speed;
            int p =  target - cars[i].position;
            if((double) p/s >currentTime  ){
                fleets++;
                currentTime = p/s;
            }
        }
        return fleets;
        
    }
    class CarLS implements Comparable<CarLS>{
        int position;
        int speed;
        CarLS(int p, int s){
            position = p;
            speed =  s;
        }
        @Override
        public int compareTo(CarLS car){
            return car.position - position;
        }
    }
}
