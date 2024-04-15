package Assignment3;

public class Test {
    public static void main(String[] args){
        //create employee objects
        Employee emp1 = new Employee(1, "Harry", "Assistant");
        Employee emp2 = new Employee(2, "Stacy", "Assistant");
        Employee emp3 = new Employee(3, "Joel", "Cater");
        Employee emp4 = new Employee(4, "Karen", "Cater");
        
        //create books objects
        Books book1 = new Books(1, "Wendy", "Big Nate", 2002, "Cartoon");
        Books book2 = new Books(2, "Paige", "Hardy Boys", 1997, "Fiction");

        //create member objects
        Member member1 = new Member(1, "Amari", 600);
        Member member2 = new Member(2, "Chucky", 1506);

        //print employees
        System.out.println("EMPLOYEES");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        //print books
        System.out.println("\nBOOKS");
        System.out.println(book1);
        System.out.println(book2);

        //print members
        System.out.println("\nMEMBERS");
        System.out.println(member1);
        System.out.println(member2);
    }
}
