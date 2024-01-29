public class Velo extends SansMoteur{
	private int nbvitesse;
	public Velo(String marque,int nbvitesse){
		super(marque);
		this.nbvitesse=nbvitesse;
		}
	public String toString(){
		return "Velo "+super.toString()+" "+this.nbvitesse+" vitesses";
		}
	public void transporter(String depart,String arrivee){
		System.out.println("Le Vélo "+this.num+" se déplace de "+depart + " a "+arrivee) ;
		}
	}
