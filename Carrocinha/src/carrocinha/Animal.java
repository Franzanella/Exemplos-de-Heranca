package carrocinha;

public class Animal {
    String Nome, Raca, Sexo, Animal;

    public String getAnimal() {
        return "Nome: " + this.Nome + "Raça: " + this.Raca + "Sexo: " + this.Sexo;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

}
