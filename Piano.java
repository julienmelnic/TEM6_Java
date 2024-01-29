public class Piano extends Instrument{
	private int nbtouche;
	public Piano(int nbtouche,int poids,int prix){
		super(poids,prix);
		this.nbtouche=nbtouche;
		}
	public String toString(){
		return "Piano "+this.nbtouche +" touches "+super.toString();
		}
	public void jouer(){
		System.out.println("Le Piano "+this.nbtouche+" touches joue");
		}
		}
