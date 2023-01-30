package br.com.bytebank.bank.model;

public class Client implements Authentication {

    private String name;
    private String cpf;
    private String profession;
    private AuthenticationE authenticationE;

    public Client() {
        this.authenticationE = new AuthenticationE();

    }

    public Client(String name, String cpf, String profession) {
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void setPassword(int password) {
        this.authenticationE.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticationE.authenticate(password);
    }

}
