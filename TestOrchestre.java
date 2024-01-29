public class TestOrchestre{
	public static void main(String[]args){
		Piano p=new Piano(88,300,700);
		Guitare g=new Guitare(3,100,"classique");
		Instrument i=new Instrument(400,1000);
		System.out.println(p);
		System.out.println(g);
		Orchestre o1=new Orchestre(3);
		o1.ajouterInstrument(p);
		o1.ajouterInstrument(g);
		o1.jouer();//probleme est qu'on nous dit que java ne trouve pas la methode jouer()
		//L'instrument joue n'est jamasi affiche car, la methode va être utilise en fonction du type de l'objet et non du type de la case du tableau 
		//41.6 si on veut ajouter un nouvel instrument on a pas besoin de modifier de classe car grâce à l'heritage on peut juste ajouter une classe qui herite d'instrument
		}
	}
		
