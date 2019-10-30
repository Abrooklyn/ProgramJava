package fr.illenji.programme;

// Classe principale

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Angie", 20.0, 300.0);
        player1.setName("Illenji");
        System.out.println(player1.getName() + ". Point de vie : " + player1.getHealth());
        player1.setAttack(30);
        System.out.println("dégats : " + player1.getAttack());

        Player player2 = new Player("Sait", 25.0, 350.0);
        player2.setName("Kaylar");
        System.out.println("name : " + player2.getName() + ". Point de vie : " + player2.getHealth());
        player2.damage(player1.getAttack());
        System.out.println(player2.getName() + ". Point de vie : " + player2.getHealth());
    }
}
