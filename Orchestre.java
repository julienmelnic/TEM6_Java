public class Orchestre{
	private Instrument[] tab;
	private int max;
	private static int nbinstru=0;
	public Orchestre(int max){
		this.max=max;
		tab=new Instrument[max];
	}
	public void ajouterInstrument(Instrument x){
		if (this.nbinstru < this.max){
			this.tab[nbinstru]=x;
			nbinstru+=1;
			}
		}
	public void jouer(){
		for (int i=0;i<this.nbinstru;i++){
			tab[i].jouer();
			}
		}
	}
	
	
