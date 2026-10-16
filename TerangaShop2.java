public class TerangaShop2 {
    public static void main(String[] args) {
String s = " TerangaShop, Dakar - Sénégal ";

System.out.println("Longueur avant nettoyage : " + s.length());

String sNettoyee = s.strip();// strip() permet de supprimer les espaces extérieurs de la chaîne //
System.out.println("Chaîne sans espaces extérieurs : \"" + sNettoyee + "\"");

System.out.println("Longueur après nettoyage : " + sNettoyee.length());// permet de connaitre la taille de la chaîne après nettoyage//

int posVirgule = sNettoyee.indexOf(',');// indexOf() permet de trouver la position de la virgule dans la chaîne//
System.out.println("Position de la virgule : " + posVirgule);

String region= sNettoyee.substring(sNettoyee.indexOf("Dakar"), sNettoyee.indexOf("Dakar")+5).strip(); // substring() permet d'extraire la sous-chaîne correspondant à la ville//
System.out.println("Nom de la région : " + region);

String sMaj = sNettoyee.toUpperCase(); // toUpperCase() permet de convertir la chaîne en majuscules//
System.out.println("Chaîne en majuscules : " + sMaj);
String Nouvelle = sNettoyee.replaceAll("(-| |,|;)", ","); // replaceAll() permet de remplacer les caractères par une virgule//
System.out.println("Chaîne avec les caractères remplacés : " + Nouvelle);
int nbrmots = Nouvelle.split(",").length;// split() permet de diviser la chaîne en mots en utilisant les espaces comme séparateurs//
System.out.println("Nombre de mots : " + nbrmots);
    }
}    