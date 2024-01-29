public class AMoteur extends Vehicule{
	protected double capacite;
	protected double essence;
	public AMoteur(String marque,double capacite){
		super(marque);
		this.capacite=capacite;
		this.essence=essence=0;
		}
	public String toString(){
		return super.toString()+", capacite="+this.capacite+", essence="+this.essence;
		}
	public void approvisionner(double nbLitres){
		if (this.capacite>nbLitres){
			this.essence=this.essence+nbLitres;
			}
		else{
			System.out.println("Vous en mettez Trop !");
			}
		}
	public boolean enPanne(){
		if (this.essence==0){
			return true;
			}
		else{
			return false;
			}
		}
	}
	//on peut la factoriser dans AMoteur
