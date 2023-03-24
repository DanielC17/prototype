public class Paciente implements Cloneable{
    private String cpf;
    private String nome;
    private String exame;
    private int idade;

    public Paciente(String cpf, String nome, String exame, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.exame = exame;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Paciente clone() throws CloneNotSupportedException{
        Paciente pacienteClone = (Paciente) super.clone();
        return pacienteClone;
    }

     public String toString(){
        return "Paciente{" +
                "cpf='" + cpf +
                "', nome='" + nome +
                "', exame='" + exame +
                "', idade=" + idade +
                "}";
     }

}
