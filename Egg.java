class Egg {
	private String status;

	public String getStatus() {
		return this.status;
	}	
    public Egg() {
		this.status = "raw";
	}
	
	public void hardBoil() {
		this.status = "hard boiled";
	}
	public void SoftBoil() {
		this.status = "soft boiled";
	}
	public String Crack() {
		String curStatus;
		curStatus = this.status;
		this.status = "cracked";
		return curStatus;
	}
	/*
	public static void main(String[] args) {
	Egg x = new Egg();
	x.hardBoil();
	System.out.println("The egg was " + x.Crack());
	System.out.println("The egg is now " + x.getStatus());
	}
	*/
 }