public class Main {
    public static void main(String[] args) {
        Candidato c1 = new Candidato();
        Candidato c2 = new Candidato();
        Candidato c3 = new Candidato();
        c1.cadastro_Candi("MAJORRI SANTIAGO", "Feminino", 1420000, "Sim", 15, "Prefeito", 10, 12, 1987);
        c1.mostra_dados();
        System.out.println();
        c2.cadastro_Candi("DR THIAGO", "Masculino", 375000, "Não", 44, "Prefeito", 25, 7, 1978);
        c2.mostra_dados();
        System.out.println();
        c3.cadastro_Candi("DR WALDOMERO ALENCAR", "Masculino", 810000, "Não", 27, "Prefeito", 22, 1, 1993);
        c3.mostra_dados();
        System.out.println();
        c1.mostraMunicipio();
    }

}
