/* Team Eupraxia: 
 * Alexander Clucas
 * James Cunningham
 * Christopher Fenrick
 * Justin Field
 * Jason Peinkofer
 * David Taylor
 * Marcos Zavala almanza
 * 
 * CS361 - Fall 2011
 * Sensor-based smart vehicle Simulation
 *
 * .java
 *
 */

public class car{
	private double speed;
	private String carName;
	private int location;

	/*first Constructor*/
	public car( double speed, String carName, int location){

		this.speed= speed;
		this.CarName= carName;
		this.location = location;
	}

	/*getter for car speed*/
	public double getSpeed(){
		return speed;
	}

	/*getter for car name*/
	public String getCarName(){
		return carName;
	}

	/*getter for car location*/
	public int getLocation(){
		return location;
	}


	/*setter for car speed*/
	public void setSpeed(double spd){
		speed=spd;
	}

	/*setter for  car name*/
	public void setCarName(String str){
		carName=str;
	}

	/*setter for car location*/
	public void setLocation(int loc){
		location= loc;
	}

	/*method to increase car speed*/
	public double increaseSpeed(double spd){
		if(spd<0){
			throw new IllegalArgumentException();
		}
		speed = speed + spd;
		return speed;
	}

	/*method to decrease car speed*/
	public double decreaseSpeed(double spd){
		if(spd<0){
			throw new IllegalArgumentException();
		}
		//check for negative speed
		if( (speed - spd) > 0){
			speed = speed - spd;
		}else{
			System.out.println("Car can not have a negative a speed")
		}
		return speed;
	}


}
