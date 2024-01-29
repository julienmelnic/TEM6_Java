public class Camion extends AMoteur{
	private double volume;
	public Camion(String marque,double capacite,double volume){
		super(marque,capacite);
		this.volume=volume;
		}
	public void transporter(String materiau,int km){
		if(this.essence<(float)km){
			this.essence=0.0;
			System.out.println("Le camion "+this.num+" n'a plus plus d'essence !");
			}
		else{
			this.rouler((double)km);
			this.essence-=(float)km;
			System.out.println("Le Camion "+this.num+" a transporte des"+materiau+" sur "+km+" km");
			}
		}
	}
		
		
	
