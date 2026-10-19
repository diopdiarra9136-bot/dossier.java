public class RechercheStock {
    public static void main(String[] args) { 
        // stocks[entrepôt][produit] 
        int[][] stocks = { 
            {12, 0, 7}, 
            {0, 3, 0}, 
            {5, 0, 9} 
        }; 
        String[] entrepots = {"Pikine", "Thiaroye", "Diamniadio"}; 
 
        // 1) Afficher uniquement les stocks non nuls (continue) 
        for (int e = 0; e < stocks.length; e++) { 
            for (int p = 0; p < stocks[e].length; p++) { 
                if (stocks[e][p] == 0) continue; 
                System.out.println(entrepots[e] + " / produit " + p + " : " + stocks[e][p]); 
            } 
        } 
 
        // 2) Trouver le premier entrepôt qui a le produit 1 (break avec étiquette) 
        String trouve = "aucun"; 
        recherche: 
        for (int e = 0; e < stocks.length; e++) { 
            for (int p = 0; p < stocks[e].length; p++) { 
                if (p == 1 && stocks[e][p] > 0) { 
                    trouve = entrepots[e]; 
                    break recherche; 
                } 
            } 
        } 
        System.out.println("Produit 1 disponible à : " + trouve); 
    } 
} 

