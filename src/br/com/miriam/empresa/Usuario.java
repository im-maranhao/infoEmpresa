package br.com.miriam.empresa;

public class Usuario {
    private String nome;
    private String sobrenome;

    public Usuario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }  

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
        public String getSobrenome(){
        return sobrenome;
    }  

    @Override
    public boolean equals(Object o){

        Usuario user = (Usuario) o;

        if(getNome().equals(user.nome) && getSobrenome().equals(user.sobrenome)){
         // return getNome().equals(this.nome) && getSobrenome().equals(this.sobrenome);

            return true;
        }
            return false;
     }

    // public int hashCode(){
    //     // return getNome.hash(nome);
    //     // return getSobrenome.hash(sobrenome);
    //     // return Object.hash(nome, sobrenome);

    // }


}
