import personagens.Guerreiro;

public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro1 = new Guerreiro("Aragorn", 10, 150, "Espada Longa");
        Guerreiro guerreiro2 = new Guerreiro("Brom",    7,  90, "Machado de Guerra");

        System.out.println("===== Ficha: " + guerreiro1.getNome() + " =====");
        guerreiro1.exibirInfo();

        System.out.println();

        System.out.println("===== Ficha: " + guerreiro2.getNome() + " =====");
        guerreiro2.exibirInfo();

        System.out.println();

        System.out.println("===== Ações de " + guerreiro1.getNome() + " =====");

        guerreiro1.atacar();

        guerreiro1.atacar(35);

        guerreiro1.atacar(50, guerreiro2.getNome());

        System.out.println();

        System.out.println("===== Comparação de Vida =====");
        System.out.println(guerreiro1.getNome() + " -> " + guerreiro1.getPontosDeVida() + " PV");
        System.out.println(guerreiro2.getNome() + " -> " + guerreiro2.getPontosDeVida() + " PV");

        if (guerreiro1.getPontosDeVida() > guerreiro2.getPontosDeVida()) {
            System.out.println(guerreiro1.getNome() + " esta em melhor estado!");
        } else if (guerreiro2.getPontosDeVida() > guerreiro1.getPontosDeVida()) {
            System.out.println(guerreiro2.getNome() + " esta em melhor estado!");
        } else {
            System.out.println("Ambos os guerreiros possuem a mesma quantidade de vida!");
        }
    }
}
