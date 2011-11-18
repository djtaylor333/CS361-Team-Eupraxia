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
	private String CarID;
	private int lane;  //lane number, 0,1 or 2
	private int laneLoc;	//location within the lane
	
	//dont know how to got about determining location of the car
	//this is what I think might work, in the array store the lane number and the second array element would be
	//the location on that lane
	private int[] location = new int[2] ; 

	/*first Constructor*/
	public car( double speed, String CarID, int lane, int laneLoc){

		this.speed= speed;
		this.CarID= CarID;
		this.location[0] = lane;
		this.location[1] = laneLoc;
	}

	/*getter for car speed*/
	public double getSpeed(){
		return speed;
	}

	/*getter for car name*/
	public String getCarID(){
		return CarID;
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
	public void setCarID(String str){
		CarID=str;
	}
		
	/*setter for car location*/
	public void setLocation(int lane, int laneLoc){
		location[0]= lane;
		location[1]= laneLoc;
	}

	/* Method for altering car speed, both increase and decrease */
	public double alterSpeed(double spd) {
		if(spd < 0) {
			throw new IllegalArgumentException();
		}
		
		speed = spd;
		return speed;
	} 
	/* Method for changing the vehicle's lane */
	public void changeLane() {
		
	}
	/* Method for changing the vehicle's position in the lane */
	public void changeLaneLoc() {
		
	}

}
