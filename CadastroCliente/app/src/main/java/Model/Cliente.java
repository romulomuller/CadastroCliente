package Model;

public class Cliente {
        
    private String nome;
    private String telefone;
    private String dataNascimento;
    
    //construtor
    public Cliente (String nome, String telefone, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
           
    //metod

    @Override
    public String toString() {
        return   nome + " / " + telefone + " / " + dataNascimento;
    }
    
    
    
}
