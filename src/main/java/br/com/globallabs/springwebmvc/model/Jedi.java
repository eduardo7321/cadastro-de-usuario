package br.com.globallabs.springwebmvc.model;

public class Jedi {
    private String idade;
    private String name;
    private String lastName;

    public Jedi(final String name, String lastname, String idade) {
      this.name = name;
      this.lastName = lastname;
      this.idade = idade;
    }

    public Jedi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
