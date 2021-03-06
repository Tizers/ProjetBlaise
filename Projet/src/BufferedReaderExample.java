/**
 * 
 */

/**
 * @author pierre
 *
 */

// pour les entreees-sorties
import java.io.*;

/** exemple de lecture de caracteres dans un fichier 
 * en utilisant un BufferedReader */
public class BufferedReaderExample 
{
  public static void main(String args[]) 
  {
    // nom du fichier
    String nomFichier;
    // fichier
    FileReader fichier = null;
    // variable pour la lecture
    String chaineLecture;

    if (args.length == 0)
      nomFichier = "fichier.txt";
    else
      nomFichier = args[0];

    try {
      // ouverture du fichier
      fichier = new FileReader (nomFichier);
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    // ouverture du BefferedReader par dessus le fichier
    BufferedReader lecteur = new BufferedReader(fichier);

    try {
      // lecture d'une ligne de donnees par readLine
      while((chaineLecture = lecteur.readLine()) != null) 
	{
	  System.out.println (chaineLecture);
	}
      // fermeture du fichier
      fichier.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}