public class Candidato {

    private String nome;
    private String genero;
    private float bens;
    private String e_Candidato;
    private int num_Candidato;
    private String cargo;
    private int dia;
    private int mes;
    private int ano;

    public void cadastro_Candi(String nome, String genero, float bens, String e_Candidato, int num_Candidato,
            String cargo, int dia, int mes, int ano) {
        setNomeCandi(nome);
        setGeneroCandi(genero);
        setBens(bens);
        setE_Candidato(e_Candidato);
        setNumCandi(num_Candidato);
        setCargo(cargo);
        setBirth(dia, mes, ano);
    }

    public void mostra_dados() {
        System.out.println("Candidato: " + this.getNomeCandi());
        System.out.println("Gênero: " + this.getGeneroCandi());
        System.out.println("Candidato a reeleição? " + this.getEcandi());
        System.out.println("Número do candidato: " + this.getNumCandi());
        System.out.println("Data de nascimento: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
        System.out.println("Cargo pretendido: " + this.getCargo());
        System.out.println("Bens financeiros: " + this.getBens());
    }

    public void mostraMunicipio() {
        System.out.println("Matrícula: 12321BCC044");
        System.out.println("Floresta do Araguaia");
    }
    public void setNomeCandi(String nome){
        this.nome = nome;
    }
    public String getNomeCandi(){
        return this.nome;
    }
    public void setGeneroCandi(String gen){
        this.genero = gen;
    }
    public String getGeneroCandi(){
        return this.genero;
    }
    public void setBens(float bens){
        this.bens = bens;
    }
    public float getBens(){
        return this.bens;
    }
    public void setE_Candidato(String e_candi){
        this.e_Candidato = e_candi;
    }
    public String getEcandi(){
        return this.e_Candidato;
    }
    public void setNumCandi(int num){
        this.num_Candidato = num;
    }
    public int getNumCandi(){
        return this.num_Candidato;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setBirth(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }

}
