package fr.illenji.programme;

// Classe principale
public class Main {

    public static void main(String[] args) {

        String pseudo = "Illenji";
        String classe = "Demon Hunter";
        int iLevel = 415;
        int level = 120;
        int age = 25;
        boolean femme = true;
        String sexe;
        if (femme = true) {
            sexe = "une";
        } else {
            sexe = "un";
        }
        int xp1 = 350;
        int xp2 = 250;
        int calculXp = ( xp1 + xp2 );

        System.out.println("mon pseudo est " + pseudo + ", j'ai " + age + " ans, je joue " + sexe + " " + classe + " Level " + level + " et j'essaye de monter mon Ilevel qui est de " + iLevel);
        System.out.println("Avec cette quête j'ai gagné " + calculXp + " d'Xp!!");
    }
}
