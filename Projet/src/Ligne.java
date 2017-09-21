/**
 * 
 */

/**
 * @author pierre
 *
 */
public class Ligne extends Figure {
	
	public int xDepart;
	public int yDepart;
	
	public int xArrive;
	public int yArrive;

	/**
	 * 
	 */
	public Ligne(int xDepart, int yDepart, int xArrive, int yArrive, String nom) {
		
		xDepart = xDepart;
		yDepart = yDepart;
		xArrive = xArrive;
		yArrive = yArrive;
		nom = nom;
		

	}

}
