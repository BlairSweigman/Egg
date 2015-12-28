import java.util.*;
class Carton {
	private int size;
	private ArrayList<Egg> eggs = new ArrayList<Egg>();
	
	public Carton(int noSize) {
         this.size = noSize;	
		 for (int i =0; i<this.size;i++) {
		 this.eggs.add(new Egg());
		} 
	}
	public int getTotal() {
		int tally = 0;
		for (Egg e : eggs) {
			if (e.getStatus() =="raw") {
				tally++;
			}
		}
		return(tally);
	}
	public void eggReport() {
		for (Egg e : eggs) {
		  System.out.println(e.getStatus());
        }
    }		
	
	private void makeEggs(int noEggs,String method) {
	for (int i=0;i<noEggs;i++) {
			for (Egg e : eggs) {
				String stat = e.getStatus();
				if (stat=="raw") {
					switch (method) {
						case "omelete":
							e.Crack();
							break;
						case "hard":
							e.hardBoil();
							break;
						case "soft":
							e.SoftBoil();
							break;
					}
				  
				  
				  break;
				}
			}
			
		}
	}
	public  void makeOmelete(int noEggs) {
		makeEggs(noEggs,"omelete");
	}
	
	public void makeHardBoiled(int noEggs) {
		makeEggs(noEggs,"hard");
	}
	
	public void makeSoftBoiled(int noEggs) {
		makeEggs(noEggs,"soft");
	}
	public static void main(String[] args) {
		Carton c = new Carton(12);
		System.out.println("We have " + c.getTotal() + " eggs ");
		c.makeOmelete(3);
		c.makeHardBoiled(2);
		c.makeSoftBoiled(1);
		System.out.println("We have " + c.getTotal() + " eggs ");
		c.eggReport();
	}	
}