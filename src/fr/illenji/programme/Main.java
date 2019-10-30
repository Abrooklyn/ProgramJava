package fr.illenji.programme;

// Classe principale

public class Main {

    public static void main(String[] args) {

        String pseudo = "Illenji";
        String classe = "Demon Hunter";
        int iLevel = 415;
        int level = 120;
        int age = 25;
        int money = 850;
        int priceArmor = 800;
        boolean hasArmor = false;
        boolean femme = true;
        String sexe;
        if (femme = true) {
            sexe = "une";
        } else {
            sexe = "un";
        }
        int xp1 = 350;
        int xp2 = 250;
        int totalXp = ( xp1 + xp2 );

        System.out.println("mon pseudo est " + pseudo + ", j'ai " + age + " ans, je joue " + sexe + " " + classe + " Level " + level + " et j'essaye de monter mon Ilevel qui est de " + iLevel);
        System.out.println("Avec cette quête j'ai gagné " + totalXp + " d'Xp!!");

        // Pour avoir la réputation amicale Illenji doit avoir 650 d'Xp

        int reputation = 650;
        int moreXp = reputation - totalXp;

        if(totalXp >= 650){
            System.out.println("Bravo ! vous avez débloqué la race des Elfes du Chocolat");
        } else {
            System.out.println("il vous manque " + moreXp);
        }

        // les stuffs gagnés

        String armor = "Os-Lame";
        String[] stuff = new String[]{
                "L'anneau de Bilbon Saké",
                "Le Bijou d'Azshara",
                "Le Bâton de Gandalf",
                "Le pouvoir du Tribunal Vivant"
        };

        System.out.println("j'ai enfin réussi à avoir " + stuff[1] + ". Je continue les donjons, prochaine étape : " + stuff[0]);

        // pseudos dans la guilde

        String namesGuild = "DreanChetbou,Nosnix,Larkay,Gunnar,NeaEky,Chetvi,Merwil";
        String[] pseudos = namesGuild.split(",");
        System.out.println(pseudos[2]);

        // chercher le deuxieme Ilevel du troisieme tableau

        int[][] guildLevel = {
                {
                    240, 413, 320
                },
                {
                    445, 120, 345
                },
                {
                    417, 308, 423
                }
        };

        System.out.println(guildLevel[2][1]+ "<--");

        for(int i = 10; i >= 0; i--){
                System.out.println("Compte à rebours, déclanchement dans " + i);
            if(i == 0){
                System.out.println("Boom !");
            }
        }

        sendMessage("test"); // test
        sendMessage("Murlock"); // test Murlock
        sendMessage("Il vous restera : " + getResultat(money, priceArmor, hasArmor));
    }

    private static void sendMessage(String message){
    System.out.println("ceci est un message dans la console : " + message);
    }

    private static int getResultat(int money, int priceArmor, boolean hasArmor){
        if(money >= priceArmor && !hasArmor){
            System.out.println("tu peut acheter cette Armure");
        } else {
            System.out.println("tu n'as pas assez de PO pour acheter cette armure");
        }
        return money - priceArmor;
    }
}
