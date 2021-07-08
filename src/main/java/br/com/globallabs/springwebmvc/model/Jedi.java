package br.com.globallabs.springwebmvc.model;

public class Jedi {


    private String email;
    private String name;
    private String lastName;
    private String telefone;

    public Jedi(final String name, String lastname, String email, String telefone) {
      this.name = name;
      this.lastName = lastname;
      this.email = email;
      this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
