import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;


//class CustomIterator implements Iterator{
//    int curr = 0, max;
//    CustomIterator(int max)
//    {
//        this.max=max;
//    }
//    @Override
//    public boolean hasNext() {
//        return curr<max;
//    }
//
//    @Override
//    public Object next() {
//        return ++curr;
//    }
//}

//class Employee {
//    private String name;
//    private double salary;
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() { return name; }
//    public double getSalary() { return salary; }
//
//    @Override
//    public String toString() {
//        return name + " - " + salary;
//    }
//}

//
//class Student{
//    private String name;
//    private char grade;
//    private int rollNo;
//
//    public Student(String name, char grade, int rollNo)
//    {
//        this.name=name;
//        this.grade=grade;
//        this.rollNo=rollNo;
//    }
//
//    public String getName() { return name; }
//    public char getGrade() { return grade; }
//    public int getRollNo() { return rollNo; }
//
//    @Override
//    public String toString()
//    {
//        return name + " - "+grade+" - "+rollNo;
//    }
//
//}


//class CustomItterator implements Iterator<String>{
//    Iterator<String> base;
//    String nextitem;
//    boolean hasnextitem;
//
//public CustomItterator(Iterator<String> base)
//{
//    this.base=base;
//    advance();
//}
//void advance()
//{
//    hasnextitem = false;
//    while (base.hasNext())
//    {
//        String val = base.next();
//        if(val.startsWith("A"))
//        {
//            nextitem = val;
//            hasnextitem=true;
//            return;
//        }
//    }
//}
//
//    @Override
//    public boolean hasNext() {
//        return hasnextitem;
//    }
//
//    @Override
//    public String next() {
//        if(!hasnextitem) throw new NoSuchElementException();
//        String result = nextitem;
//        advance();
//        return result;
//    }
//}



//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() { return name; }
//    public int getAge() { return age; }
//
//    @Override
//    public String toString() {
//        return name + " - " + age;
//    }
//}


//class Student implements Comparable<Student> {
//    private String name;
//    private char grade;
//    private int rollNo;
//
//    public Student(String name, char grade, int rollNo) {
//        this.name = name;
//        this.grade = grade;
//        this.rollNo = rollNo;
//    }
//
//    public String getName() { return name; }
//    public char getGrade() { return grade; }
//    public int getRollNo() { return rollNo; }
//
//    @Override
//    public String toString() {
//        return name + " - " + grade + " - " + rollNo;
//    }
//
//    @Override
//    public int compareTo(Student other) {
//        // natural ordering: by rollNo ascending
//        return Integer.compare(this.rollNo, other.rollNo);
//    }
//}



//class Product implements Comparable<Product> {
//    private String name;
//    private double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public int compareTo(Product other) {
//        // Compare by price (ascending)
//        return Double.compare(this.price, other.price);
//    }
//
//    @Override
//    public String toString() {
//        return name + " - ₹" + price;
//    }
//
//    // Example usage
//
//}




//class Book implements Comparable<Book> {
//    private String title;
//    private String author;
//    private int publicationYear;
//
//    public Book(String title, String author, int publicationYear) {
//        this.title = title;
//        this.author = author;
//        this.publicationYear = publicationYear;
//    }
//
//    public String getTitle() { return title; }
//    public String getAuthor() { return author; }
//    public int getPublicationYear() { return publicationYear; }
//
//    @Override
//    public String toString() {
//        return title + " by " + author + " (" + publicationYear + ")";
//    }
//
//    @Override
//    public int compareTo(Book other) {
//        return this.title.compareTo(other.title);
//    }
//}



//class Employee implements Comparable<Employee> {
//    private String name;
//    private int employeeId;
//    private double salary;  // or other fields
//
//    public Employee(String name, int employeeId, double salary) {
//        this.name = name;
//        this.employeeId = employeeId;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public int compareTo(Employee other) {
//        return Integer.compare(this.employeeId, other.employeeId);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{name='" + name + "', employeeId=" + employeeId + ", salary=" + salary + "}";
//    }
//}




class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private long timestamp;

    public Task(String name, int priority, long timestamp) {
        this.name = name;
        this.priority = priority;
        this.timestamp = timestamp;
    }

    @Override
    public int compareTo(Task other) {
        int p = Integer.compare(other.priority, this.priority);
        if (p != 0) return p;
        return Long.compare(this.timestamp, other.timestamp);
    }

    @Override
    public String toString() {
        return name + " (priority=" + priority + ", time=" + timestamp + ")";
    }
}







public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
//        list.add(12);
//        System.out.println("List : ");
//        System.out.println(list);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext())
//        {
//            int a = iterator.next();
//            if(!(a%2==0))
//            {
//
//                iterator.remove();
//            }
//        }
//        System.out.println();
//        System.out.println("After Remove odd Numbers : ");
//        System.out.println(list);


        //02
//        ListIterator<Integer> iterator = list.listIterator();
//        System.out.println("Forward : ");
//        while (iterator.hasNext())
//        {
//
//            System.out.print(iterator.next()+"  ");
//        }
//        System.out.println();
//
//        System.out.println("Backword : ");
//        while (iterator.hasPrevious())
//        {
//            System.out.print(iterator.previous()+"  ");
//        }



        //03
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Shahid");
//        list.add("kamil");
//        list.add("Bhargav");
//        list.add("ravi");
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext())
//        {
//            String str = iterator.next();
//            iterator.set(str.toUpperCase());
//        }
//        System.out.println("List : ");
//        System.out.println(list);



//        04
//        CustomIterator c1 = new CustomIterator(5);
//        for (CustomIterator c = c1 ; c.hasNext() ;)
//        {
//            System.out.println(c.next());
//        }



//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(16);
//        list.add(15);
//        ListIterator<Integer> iterator = list.listIterator();
//
//        try {while (iterator.hasNext())
//            {
//                System.out.println(iterator.next());
//                                        list.add(20);
//            }
//        }
//        catch (ConcurrentModificationException e)
//        {
//            System.out.println(e);
//        }



        //07
//        List<String> s1 = List.of("Shahid", "Arbaz", "aryan","kamil","Allu");
//        CustomItterator it = new CustomItterator(s1.iterator());
//        while (it.hasnextitem)
//        {
//            System.out.println(it.next());
//        }


//        List<String> s1 = List.of("Shahid", "Arbaz", "aryan","kamil","Allu");
//
//        Spliterator spliterator = s1.spliterator();
//        Spliterator spliterator1 = spliterator.trySplit();
//
//        Thread t1 = new Thread(()->{
//            System.out.println("Thread 1 processing...");
//            spliterator.forEachRemaining(System.out::println);
//        });
//
//        Thread t2 = new Thread(()->{
//            System.out.println("Thread 2 processing...");
//            if(spliterator1!=null)
//            {
//                spliterator1.forEachRemaining(System.out::println);
//            }
//        });
//
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        }catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }



//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        Iterator<Integer> iterator = list.descendingIterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }



//        Map<String,Integer> person = new HashMap<>();
//        person.put("Shahid",20);
//        person.put("kamil",30);
//        person.put("Bhargav",40);
//
//        Iterator<Map.Entry<String,Integer>> iterator = person.entrySet().iterator();
//        while (iterator.hasNext())
//        {
//            Map.Entry<String,Integer> map = iterator.next();
//            System.out.println(map.getKey()+" : "+map.getValue());
//        }



        //11
//        List<String> list = new ArrayList<>();
//        list.add("Shahid");
//        list.add("bhargav");
//        list.add("zeref");
//        list.add("yashok");
//
//        System.out.println("Before Sort : ");
//        System.out.println(list);
//
//        list.sort(Comparator.comparingInt(String::length));
//
//        System.out.println(list);



//      List<Employee> employees = new ArrayList<>();
//      employees.add(new Employee("Shahid",2000));
//        employees.add(new Employee("bhargav",20));
//        employees.add(new Employee("kamil",200));
//
//        employees.sort(Comparator.comparing(Employee::getSalary));
//
//        System.out.println(employees);


        //13
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person("Alice", 30));
//        persons.add(new Person("Bob", 25));
//        persons.add(new Person("Alice", 22));
//
//        persons.sort(
//                Comparator.comparing(Person::getName)
//                        .thenComparing(Person::getAge)
//        );
//
//        System.out.println(persons);



//        List<String> name = new ArrayList<>();
//        name.add("shahid");
//        name.add("kamil");
//        name.add("arbaz");
//        name.add("zeref");
//
//        System.out.println(name);
//        name.sort(Comparator.reverseOrder());
//        System.out.println(name);



//        List<LocalDate> dates = Arrays.asList(
//                LocalDate.of(2023, 5, 10),
//                LocalDate.of(2021, 2, 15),
//                LocalDate.of(2022, 8, 20)
//        );
//
//        // Sort ascending
//        dates.sort((d1, d2) -> d1.compareTo(d2));
//
//        System.out.println("Ascending: " + dates);
//
//        // Sort descending
//        dates.sort((d1, d2) -> d2.compareTo(d1));
//
//        System.out.println("Descending: " + dates);




//        List<String> list = new ArrayList<>();
//        list.add("Shahid");
//        list.add("bhargav");
//        list.add("Zeref");
//        list.add("yashok");
//
//        System.out.println("Before Sort : ");
//        System.out.println(list);
//
//        list.sort(String.CASE_INSENSITIVE_ORDER);
//
//        System.out.println("After Sort : ");
//        System.out.println(list);




//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Alice", 'a',15));
//        students.add(new Student("Alice", 'a',16));
//        students.add(new Student("bob", 'b',19));
//
//
//        students.sort(
//                Comparator.comparing(Student::getName).thenComparing(Student::getGrade).thenComparing(Student::getRollNo)
//        );
//
//        System.out.println(students);




//        List<String> names = Arrays.asList(
//                "John Michael Doe",
//                "Alice Smith",
//                "Bob Anderson",
//                "Charlie Brown"
//        );
//
//        names.sort((s1, s2) -> {
//            String last1 = s1.substring(s1.lastIndexOf(" ") + 1);
//            String last2 = s2.substring(s2.lastIndexOf(" ") + 1);
//            return last1.compareTo(last2);
//        });
//
//        System.out.println(names);



//        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//
//        System.out.println(set);




        //20
//        String[] files = { "report.pdf", "image.jpeg", "archive.tar.gz", "notes.txt", "README" };
//
//        Arrays.sort(files, Comparator.comparing(
//                s -> {
//                    int i = s.lastIndexOf('.');
//                    return (i < 0 ? "" : s.substring(i + 1)).toLowerCase();
//                }
//        ));
//
//        System.out.println(Arrays.toString(files));



//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Alice", 'A', 102));
//        students.add(new Student("Bob",   'B', 101));
//        students.add(new Student("Charlie",'C', 105));
//
//        Collections.sort(students);
//
//        for (Student s : students) {
//            System.out.println(s);
//        }





//            List<Product> products = new ArrayList<>();
//            products.add(new Product("Pen", 10.5));
//            products.add(new Product("Notebook", 50.0));
//            products.add(new Product("Eraser", 5.0));
//            products.add(new Product("Bag", 499.99));
//
//            Collections.sort(products);  // sorts by price automatically
//
//            for (Product p : products) {
//                System.out.println(p);
//            }



//        List<Book> books = new ArrayList<>();
//        books.add(new Book("Effective Java", "Josh Bloch", 2008));
//        books.add(new Book("clean code", "Robert C. Martin", 2001));
//        books.add(new Book("Algorithms", "Robert Sedgewick", 1983));
//        books.add(new Book("Design Patterns", "Erich Gamma et al.", 1994));
//
//        Collections.sort(books);  // uses compareTo() of Book — sorts by title
//
//        for (Book b : books) {
//            System.out.println(b);
//        }




//        List<Employee> workers = new ArrayList<>();
//        workers.add(new Employee("Alice", 103, 50_000));
//        workers.add(new Employee("Bob",   101, 55_000));
//        workers.add(new Employee("Charlie", 102, 48_000));
//
//        Collections.sort(workers);  // sorts by employeeId thanks to compareTo()
//
//        for (Employee e : workers) {
//            System.out.println(e);
//        }




            List<Task> tasks = Arrays.asList(
                    new Task("A", 2, 1000),
                    new Task("B", 1, 900),
                    new Task("C", 2, 800),
                    new Task("D", 2, 1200)
            );

            Collections.sort(tasks);
            System.out.println(tasks);



    }
}