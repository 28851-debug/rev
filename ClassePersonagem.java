package enums;

public enum ClassePersonagem {

    GUERREIRO(1, "Guerreiro"),
    MAGO(2, "Mago"),
    ARQUEIRO(3, "Arqueiro");

    private final int codigo;
    private final String nomeExibicao;

    ClassePersonagem(int codigo, String nomeExibicao) {
        this.codigo = codigo;
        this.nomeExibicao = nomeExibicao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }
}
