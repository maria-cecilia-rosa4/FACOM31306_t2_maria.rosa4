public class Main {

    public static void main(String[] args){
        Candidato[] CANDIDATO = new Candidato[3];

        CANDIDATO[0] = new Candidato();
        CANDIDATO[1] = new Candidato();
        CANDIDATO[2] = new Candidato();

        CANDIDATO[0].cadastro_Candidato( "MAJORRI SANTIAGO", "Feminino", 1420000, "Sim", 15, "Prefeito", 10, 12, 1987);
        CANDIDATO[1].cadastro_Candidato("DR THIAGO", "Masculino", 375000, "Não", 44, "Prefeito", 25, 7, 1978);
        CANDIDATO[2].cadastro_Candidato("DR WALDOMERO ALENCAR", "Masculino", 810000, "Não", 27, "Prefeito", 22, 1, 1993);

        for (Candidato MC : CANDIDATO) {
            MC.mostra_dados();
            MC.mostraMunicipio();
            System.out.println( ""); 
        }

        
    }
}