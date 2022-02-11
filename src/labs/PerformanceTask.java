package labs;

public class PerformanceTask {

	public static void main(String[] args) {
		int v0 = 30;
		int angle = 60;
		double dt = 0.5;

		double vx = v0 * Math.cos(Math.PI / 180 * angle);
		double vy = v0 * Math.sin(Math.PI / 180 * angle); 

		double posx = 1;
		double posy = 1;
		double time = 0;

		while(posy > 0)
		{
		   posx +=  vx * dt;
		   posy += vy * dt;
		   time += dt;
 
		   vy -= 9.82 * dt;
		}
		System.out.println(vy);
		
		
		
		
	}
	
	
}
