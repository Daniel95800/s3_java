
public abstract class Robot {
	private int numeroCase;
	private Objet monObjet;
	private Casier monCasier;
	private ComportementSeDeplacer unComportementSeDeplacer;
	private ComportementManipuler unComportementManipuler;
	
	public void setNumeroCase(int numeroCase)
	{
		this.numeroCase = numeroCase;
	}
	
	public int getNumeroCase()
	{
		return this.numeroCase;
	}
	
	public void setObjet(Objet objet)
	{
		this.monObjet = objet;
	}
	
	public Objet getObjet()
	{
		return this.monObjet;
	}
	
	public void setCasier(Casier casier)
	{
		this.monCasier = casier;
	}
	
	public Casier getCasier()
	{
		return this.monCasier;
	}
	
	public void setUnComportementSeDeplacer(ComportementSeDeplacer seDeplacer)
	{
		this.unComportementSeDeplacer = seDeplacer;
	}
	
	public ComportementSeDeplacer getUnComportementSeDeplacer()
	{
		return this.unComportementSeDeplacer;
	}
	
	public void setUnComportementManipuler(ComportementManipuler Manipuler)
	{
		this.unComportementManipuler = Manipuler;
	}
	
	public ComportementManipuler getUnComportementManipuler(ssss)
	
	
	public Robot(Casier unCasier)
	{
		this.unCasier = unCasier;
		this.monObjet = null;
		this.numeroCase = 0;
	}
	
	public void executerSeDplacer(int numeroCaseArrivee)
	{
		System.out.println(this);
		this.unComportementSeDeplacer.seDeplacer();
		this.setNumeroCase(numeroCaseArrivee);
		System.out.println("se déplace vers la case" + this.getNumeroCase);
		
	}
}
