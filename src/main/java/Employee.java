public abstract class Employee {
// can not be instantiated (new)
    private String name;
    private String cpf;
    private double salary;

    public abstract double getBonus(); // the method is not implemented, need to be implemented in sons

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
