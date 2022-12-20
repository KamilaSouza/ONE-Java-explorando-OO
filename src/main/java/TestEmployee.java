public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Kami");
        employee.setCpf("123456789");
        employee.setSalary(1500);

        System.out.println(employee.getName());
        System.out.println(employee.getBonus());

        Manager manager = new Manager();

        manager.setName("Nico");
        manager.setSalary(5000);
        manager.setPassword(321);
        boolean authenticate = manager.authenticate(321);

        System.out.println(manager.getName());
        System.out.println(authenticate);
        System.out.println(manager.getBonus());
    }
}
