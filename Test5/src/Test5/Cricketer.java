package Test5;

public class Cricketer {
	private int playerId;
	private String name;
	private boolean isBaller;
	private float strikeRate;
	private double runs;

	public Cricketer() {
		super();

	}

	public Cricketer(int playerId, String name, boolean isBaller, float strikeRate, double runs) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.isBaller = isBaller;
		this.strikeRate = strikeRate;
		this.runs = runs;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getisBaller() {
		return isBaller;
	}

	public void setBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}

	public float getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}

	public double getRuns() {
		return runs;
	}

	public void setRuns(double runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Cricketer [playerId=" + playerId + ", name=" + name + ", isBaller=" + isBaller + ", strikeRate="
				+ strikeRate + ", runs=" + runs + "]";
	}

	public static void main(String args[]) {

		// int myArr= {cric};

		Cricketer cric[] = new Cricketer[5];

		cric[0] = new Cricketer(7, "MS Dhoni", false, 87.66f, 9773);
		cric[1] = new Cricketer(8, "Ravindra Jadeja", true, 56.52f, 2769);
		cric[2] = new Cricketer(45, "Rohit Sharma", false, 89.88f, 10125);
		cric[3] = new Cricketer(18, "Virat Kohli", false, 96.77f, 13787);
		cric[4] = new Cricketer(228, "Hardik Pandya", true, 23.46f, 731);

		for (Cricketer cr : cric) {
			System.out.println(cr);

		}

	}

}
