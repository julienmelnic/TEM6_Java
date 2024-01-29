public class Vehicule{
	private static int cpt=0;
	private String marque;
	private double distanceparcourue;
	protected final int num;
	public Vehicule(String marque){
		this.marque=marque;
		this.distanceparcourue=0;
		cpt+=1;
		this.num=cpt;
		}
	public String toString(){
		return this.num+" de marque "+this.marque;
		}
	protected void rouler(double distance){
		this.distanceparcourue+=distance;
		System.out.println(this.toString()+" a roulée "+this.distanceparcourue);
	}
	}
