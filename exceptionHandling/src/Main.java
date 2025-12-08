import java.io.*;
import java.security.PrivateKey;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


//01.
//    void division() {
//        Scanner sc = new Scanner(System.in);
//
//       try {
//           System.out.println("Enter Value for Division : ");
//           int a = sc.nextInt();
//           System.out.println("Enter Value that Divide " + a);
//           int b = sc.nextInt();
//           System.out.println("Division : "+(a/b));
//       }catch (ArithmeticException e)
//       {
//           System.out.println("Exception : "+e);
//       }
//    }



//02.
//    void intConvert(String string){
//        try {
//            int a = Integer.parseInt(string);
//            System.out.println("Parsed String : "+a);
//        }catch (NumberFormatException e)
//        {
//            System.out.println("Invalid Number Formate : "+e);
//        }
//    }



//03.
//    void readArray(int l)
//    {
//        Scanner sc = new Scanner(System.in);
//        try {
//            int arr[]=new int[l];
//            System.out.println("Enter Array Elements");
//            for(int i=0;i<l;i++)
//            {
//                System.out.println("Array["+i+"] = ");
//                arr[i]=sc.nextInt();
//            }
//            System.out.println("Enter Array index for access : ");
//            int i = sc.nextInt();
//            System.out.println("Array["+i+"] = "+arr[i]);
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Sorry : "+e);
//        }
//    }



//04.
//    void nullString()
//    {
//        String str = null;
//        try{
//            System.out.println("The Length of String :"+str.length());
//        }
//        catch (NullPointerException e)
//        {
//            System.out.println("Null String : "+e);
//        }
//    }



//05.
//    void nestedtry ()throws InputMismatchException
//    {
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Enter Length for Array = ");
//            int l = sc.nextInt();
//            if (l < 0) {
//                throw new InputMismatchException("Array length cannot be negative.");
//            }
//            int[] arr=new int[l];
//            System.out.println("Enter Array Elements");
//            for(int i=0;i<l;i++)
//            {
//                System.out.println("Array["+i+"] = ");
//                arr[i]=sc.nextInt();
//            }
//            try {
//                System.out.println("Enter Array index for access : ");
//                int i = sc.nextInt();
//                System.out.println("Array["+i+"] = "+arr[i]);
//            }catch (ArrayIndexOutOfBoundsException e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }catch (InputMismatchException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }



//06.
//
//    void divisionWithFile() throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter Value for Division : ");
//            int a = sc.nextInt();
//            System.out.println("Enter Value that Divide " + a);
//            int b = sc.nextInt();
//            System.out.println("Division : "+(a/b));
//            File f1 = new File("test1.txt");
//            Scanner sc1 = new Scanner(f1);
//            System.out.println(sc1.nextLine());
//        }catch (ArithmeticException e)
//        {
//            System.out.println("Exception : "+e.getMessage());
//        }
//        catch (FileNotFoundException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }



//07.
//    void subStringCatch()throws InputMismatchException
//    {
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter String : ");
//            String inpu = sc.nextLine();
//            String str = inpu.equals("null")?null:inpu;
//            System.out.println("String is : "+str);
//            System.out.println("The Length of String :"+str.length());
//            System.out.print("Enter Start index for substring: ");
//            int si = sc.nextInt();
//            if (si < 0 || si > str.length() - 1) {
//                throw new InputMismatchException("Invalid start index! Must be between 0 and " + (str.length() - 1));
//            }
//            System.out.print("Enter End index for substring: ");
//            int ei = sc.nextInt();
//            if (ei < si || ei > str.length()) {
//                throw new InputMismatchException("Invalid end index! Must be between " + si + " and " + str.length());
//            }
//            System.out.println("Sub String : "+str.substring(si,ei));
//        }
//        catch (NullPointerException | InputMismatchException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }



//    void calculator()throws InputMismatchException
//    {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//
//            System.out.println("1. Addition : ");
//            System.out.println("2. Subtraction : ");
//            System.out.println("3. Multiplication : ");
//            System.out.println("4. Division : ");
//            System.out.println("Enter Choice : ");
//            int ch = sc.nextInt();
//            if(ch<=0 || ch>4)
//            {
//                throw new InputMismatchException("Enter Valid Number!!");
//            }
//            switch (ch)
//            {
//                case 1 :try{
//
//                    System.out.println("Enter Value for A = ");
//                    int a = sc.nextInt();
//                    System.out.println("Enter Value for B = ");
//                    int b = sc.nextInt();
//                    System.out.println("Addition : "+(a+b));
//                }catch (InputMismatchException e)
//                {
//                    System.out.println(e.getMessage());
//                }
//                    break;
//                case 2 :try{
//                    System.out.println("Enter Value for A = ");
//                    int c = sc.nextInt();
//                    System.out.println("Enter Value for B = ");
//                    int d = sc.nextInt();
//                    if (c>d)
//                    {
//                         throw new InputMismatchException("Enter Valid Number!!");
//                    }
//                    System.out.println("Subtraction : "+(c-d));
//
//                }catch (InputMismatchException e)
//                {
//                    System.out.println(e.getMessage());
//                }
//                    break;
//                case 3 :try{
//                    System.out.println("Enter Value for A = ");
//                    int e = sc.nextInt();
//                    System.out.println("Enter Value for B = ");
//                    int f = sc.nextInt();
//                    System.out.println("Multiplication : "+(e*f));
//                }catch (InputMismatchException e)
//                {
//                    System.out.println(e.getMessage());
//                }
//                    break;
//                case 4 :try{
//                    System.out.println("Enter Value for A = ");
//                    int g = sc.nextInt();
//                    System.out.println("Enter Value for B = ");
//                    int h = sc.nextInt();
//                    if (h<=0)
//                    {
//                        throw new InputMismatchException("Enter Valid Number!!");
//                    }
//                    System.out.println("Division : "+(g/h));
//                }catch (InputMismatchException e)
//                {
//                    System.out.println(e.getMessage());
//                }
//                    break;
//                default:
//                    System.out.println("Enter Valid Choice!!!!");
//            }
//
//
//        }catch (InputMismatchException e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//
//    }




//    void buffReader()
//    {
//        try (BufferedReader br = new BufferedReader(new FileReader("test1.txt"))){
//
//            String str ;
//            while ((str=br.readLine())!=null)
//            {
//                System.out.println(str);
//            }
//        }
//        catch (FileNotFoundException e)
//        {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }




//    void fileWri()
//    {
//        try (FileWriter fw = new FileWriter("test1.txt")){
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter Any Input For File : ");
//            String input  = sc.nextLine();
//            fw.write(input);
//        }
//        catch (FileNotFoundException e)
//        {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }





//    void copyContent() throws IOException {
//
//        File source = new File("source.txt");
//        File destination = new File("destination.txt");
//        source.createNewFile();
//        destination.createNewFile();
//        try (FileInputStream fis1 = new FileInputStream(source);
//             FileOutputStream fos2 = new FileOutputStream(destination)){
//                int c;
//                while ((c=fis1.read())!=-1)
//                {
//                    fos2.write(c);
//                }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }





//    void divisionFinal() {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter Value for Division : ");
//            int a = sc.nextInt();
//            System.out.println("Enter Value that Divide " + a);
//            int b = sc.nextInt();
//            System.out.println("Division : "+(a/b));
//        }catch (ArithmeticException e)
//        {
//            System.out.println("Exception : "+e);
//        }
//        finally {
//            System.out.println("Always Executes :::");
//        }
//    }



//    void buffCloseFina() throws IOException {
//      FileReader fr = new FileReader("test1.txt");
//        try {
//            int str;
//            System.out.println("This is File");
//            while ((str=fr.read())!=-1)
//            {
//                System.out.print((char)str);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//        finally {
//            try {
//                fr.close();
//            }
//            catch (FileNotFoundException e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }
//    }




//    int tryFinally()
//    {
//        int arr[]={1,2,3};
//            try {
//                return arr[1];
//                }
//            finally {
//                System.out.println("This is Array First Index Element n finally Block : "+arr[1]);
//            }
//    }



//    void ageValidatorExcep() throws IllegalArgumentException
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your age =");
//        int age = sc.nextInt();
//        if(age<18)
//        {
//            throw new IllegalArgumentException("Invalid Age !!");
//        }else {
//            System.out.println("Access Granted :");
//        }
//
//    }



//    void uname()throws InvalidUsernameException
//    {
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Please Enter User Name : ");
//            String uname = sc.nextLine();
//            if(uname.length()<4 || uname.contains(" "))
//            {
//                throw new InvalidUsernameException("Invalid Username!! it's Length Must be More than 4 chars And It Did not Contains The Space");
//            }
//            System.out.println(uname+" User Name Accepted!");
//        }catch (InvalidUsernameException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }





//    void checkNegative()
//    {
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Any Number : ");
//            int num = sc.nextInt();
//            if(num<0)
//            {
//                throw new NegativeNumberException("User Name Must be Positive or Zero ******");
//            }
//            System.out.println("Your Number is : "+num);
//        }catch (NegativeNumberException e)
//        {
//            System.out.println(e);
//        }
//    }




    public static void main (String[] args) throws NegativeNumberException {


        Scanner sc = new Scanner(System.in);

        Main m = new Main();

//01.
//        m.division();

//02.
//        m.intConvert("123ggdg");

//03.
//        System.out.println("Enter Length of Array : ");
//        int l = sc.nextInt();
//        m.readArray(l);

//04.
//        m.nullString();

//05.
//        m.nestedtry();

//06.
//        try {
//            m.divisionWithFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        m.subStringCatch();


//        m.calculator();

//        m.buffReader();


//        m.fileWri();


//        try {
//            m.copyContent();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        m.divisionFinal();

//        try {
//            m.buffCloseFina();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println("This is arrays First Element from Main method Return by try method : "+m.tryFinally());


//        m.ageValidatorExcep();


//        m.uname();




//        m.checkNegative();






//        CheckingAccount c = new CheckingAccount(101);
//        System.out.println("Depositing 500...");
//        c.deposit(500.00);
//
//        try {
//            System.out.println("\nWithdrawing 100...");
//            c.withdraw(100.00);
//            System.out.println("\nWithdrawing 600...");
//            c.withdraw(600.00);
//        } catch (BankException e) {
//            System.out.println("Sorry, but you are short " + e.getAmount());
//            e.printStackTrace();
//        }
    }
}

class  InvalidUsernameException extends Exception{
    public InvalidUsernameException(String username)
    {
        super(username);
    }
}

class NegativeNumberException extends Exception{
    public NegativeNumberException(String tell)
    {
        super(tell);
    }
}







//class CheckingAccount {
//    private double balance;
//    private int number;
//
//    public CheckingAccount(int number) {
//        this.number = number;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) throws BankException {
//        if(amount <= balance) {
//            balance -= amount;
//        }else {
//            double needs = amount - balance;
//            throw new BankException(needs);
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//}
//
//class BankException extends Exception {
//    private double amount;
//
//    public BankException(double amount) {
//        this.amount = amount;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//}