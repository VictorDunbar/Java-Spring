
public class Lakers {
	private boolean shooting = false;
	public void dribblingBall() {
		System.out.println("Lonzo Ball starts a fastbreak for the Lakers!");
	}
	public void passBall() {
		System.out.println("He passes the ball to Ingram!");
	}
	public void startShooting() {
		shooting = true;
		System.out.println("The ball is in the air!");
	}
	public boolean isShooting() {
		return shooting;
	}
}
