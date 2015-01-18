package lianxi1;

public class lianxi1_2 {
	public static void main(String args[]){
		Vehicle Motorbike = new Vehicle();
		System.out.println(Motorbike.speed = 5);
		System.out.println(Motorbike.size = 10);
		System.out.println(Motorbike.speedUp(5));
		System.out.println(Motorbike.speedDown(2));
	}
}

class Vehicle{
	 int speed,size;
	 void move(){
		 
	 }
	 int setSpeed(int speed){
		 speed = this.speed;
		 return speed;
	 }
	 int speedUp(int n){
		 return speed = speed+n;
	 }
	 int speedDown(int n){
		 return speed = speed-n;
	 }
}