public class Voiture extends AMoteur{
	private int nbplace;
	public Voiture(String marque,double capacite,int nbplace){
		super(marque,capacite);
		this.nbplace=nbplace;
		}
	public String toString(){
		return "La voiture "+super.toString();
		}
	public void transporter(int nbPers,int km){
		if(nbPers>this.nbplace){
			System.out.println("Pas assez de place");
			}
		else if (this.essence < (double)km){
			System.out.println("La voiture "+this.num+" n'a plus d'essence");
			this.essence=0.0;
			}
		else{
			this.essence=this.essence -(double)km;
			this.rouler((double)km);
			System.out.println("La voiture "+this.num+" transporte "+nbPers+" personnes sur "+km+" km");
			}
		}
	}
	
		
	
