package lesson5;
public class lesson5 {
        // это поля класса
        static class Employee {
            String name; //ФИО
            String position; //должность
            String email; //емейл
            String phone_number; //номер телефона
            int salary; //зарплата
            int age; //возраст


            public Employee(String name, String position, String email, String phone_number, int salary, int age) {
                this.name = name;
                this.position = position;
                this.email = email;
                this.phone_number = phone_number;
                this.salary = salary;
                this.age = age;
                }


            @Override
            public String toString(){
                return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                        name, position, email, phone_number, salary, age);}

            // это метод вывода в консоль
            public void print(){
                System.out.println(this);
            }

            public static void main(String[] args) {

                    Employee[] persArray = new Employee[5];
                    persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
                    persArray[1] = new Employee("Petrov Ivan", "Doctor", "petrvan@mailbox.com", "892312313", 50000, 39);
                    persArray[2] = new Employee("Suvorov Ivan", "Director", "suvivan@mailbox.com", "892312314", 80000, 40);
                    persArray[3] = new Employee("Antonov Ivan", "Worker", "antivan@mailbox.com", "892312315", 25000, 45);
                    persArray[4] = new Employee("Berezin Ivan", "Driver", "berivan@mailbox.com", "892312316", 35000, 30);

                    // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
                    for (int i=0; i < persArray.length; i++)
                        if (persArray[i].age > 40) persArray[i].print();
                    }
                }
                
            }

