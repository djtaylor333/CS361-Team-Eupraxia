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
	
	//dont know how to got about determining location of the car
	//this is what I think might work, in the array store the lane number and the second array element would be
	//the location on that lane
	private int[] location = new int[2] ; 

	/*first Constructor*/
	public car( double speed, String carName, int lane, int laneLoc){

		this.speed= speed;
		this.CarName= carName;
		this.location[0] = lane;
		this.location[1] = laneLoc;
	}

	/*getter for car speed*/
	public double getSpeed(){
		return speed;
	}

	/*getter for car name*/
	public String getCarName(){
		return carName;
	}

	/*getter for car location within the lane*/
	public int getLaneLocation(){
		return location[1];
	}

	/*getter for car lane*/
	public int getLane(){
		return location[0];
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
	public void setLocation(int lane, int laneLoc){
		location[0]= lane;
		location[1]= laneLoc;
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
