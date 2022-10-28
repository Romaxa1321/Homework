public class Main {
    public static void main(String[] args) {

        //Exercise 1
        int age = 19;
        System.out.println("Exercise 1:");
        if (age < 0) {
            System.out.println("Wrong age!");
        } else if (age >= 0 && age < 18) {
            System.out.println("You`re not an adult");
        } else {
            System.out.println("You`re an adult");
        }

        //Exercise 2

        int term = 1;
        int salary = 1000;
        System.out.println("Exercise 2:");

        if (term >= 1 && term < 3)
        {
            if (salary + salary * 0.1 < 4000)
            {
                System.out.println((salary + salary * 0.1) + 1000);
            }

            else
            {
                System.out.println((salary + salary * 0.1) + 500);
            }
        }

        if (term >= 3)
        {
            if (salary + salary * 0.2 < 4000)
            {
                System.out.println((salary + salary * 0.2) + 1000);
            }

            else
            {
                System.out.println((salary + salary * 0.2) + 500);
            }
        }

        System.out.println((50 * (50 + 1) / 2));

    }
}