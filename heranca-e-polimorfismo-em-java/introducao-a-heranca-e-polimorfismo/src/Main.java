import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        switch(employee){
            case Manager manager ->{
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setComission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentagePerSale(10);
                salesman.setSaleAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentagePerSale());
                System.out.println(salesman.getSaleAmount());
            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println("==============");
    }
}

//      if (employee instanceof domain.Manager) {
//            employee.setName("João");
//            ((domain.Manager) employee).setLogin("joao");
//            ((domain.Manager) employee).setPassword("123456");
//
//            System.out.println(employee.getName());
//            System.out.println(((domain.Manager) employee).getLogin());
//            System.out.println(((domain.Manager) employee).getPassword());
//        }
