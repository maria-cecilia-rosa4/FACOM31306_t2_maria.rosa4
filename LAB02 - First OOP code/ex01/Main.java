public class Main {
    public static void main(String[] args) {
    Candidato c1 = new Candidato();
    c1.nomeCompleto = "MAJORRI CERQUEIRA DA SILVA AQUINO SANTIAGO";
    c1.dataDeNascimento = "10/12/1987";
    c1.genero = 'F';
    c1.bens = "R$ 1.420.000.00";
    c1.reeleicao = "Sim";
    c1.numeroPartido = 15;
    c1.cargoPretendido = "Prefeita";
    c1.cadastrar(null, null, null, null, null, null, null);

    Candidato c2 = new Candidato();
    c2.nomeCompleto = "THIAGO SANCHES FLORES PINTO";
    c2.dataDeNascimento = "25/07/1978";
    c2.genero = 'M';
    c2.bens = "R$ 375.000,00";
    c2.reeleicao = "Não";
    c2.numeroPartido = 44;
    c2.cargoPretendido = "Prefeito";
    c2.cadastrar(null, null, null, null, null, null, null);

    Candidato c3 = new Candidato();
    c3.nomeCompleto = "WALDOMERO JEFFERSON BALBINO DE ALENCAR";
    c3.dataDeNascimento = "22/01/1993";
    c3.genero = 'M';
    c3.bens = "R$ 810.000,00";
    c3.reeleicao = "Não";
    c3.numeroPartido = 27;
    c3.cargoPretendido = "Prefeito";
    c3.cadastrar(null, null, null, null, null, null, null);
    
    

    }
}