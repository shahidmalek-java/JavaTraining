class MyArraylist{
    public int[] a;

    public MyArraylist()
    {
        a=new int[0];
    }
    public int getA(int i) {
        return a[i];
    }
    public void getSize()
    {
        System.out.println("Size of ArrayList : " +a.length);
    }
    public void setA(int i,int value)
    {
        try {
            a[i]=value;
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
    void remove(int ind)
    {
        int j =0;
        int[] newArr = new int[a.length-1];
        for (int i = 0 ; i < a.length ; i++)
        {
            if(i==ind)
            {
                continue;
            }
            newArr[j]=a[i];
            j++;
        }
        a=newArr;

    }
    void add(int value)
    {

        int[] newArr = new int[a.length+1];
        for(int i = 0 ; i < a.length ; i++)
        {
            newArr[i]=a[i];
        }
        newArr[a.length]= value;
        a=newArr;

    }
    void printArr()
    {
        System.out.println("Array List : ");
        for(int b : a)
        {
            System.out.print(b+" ");
        }
        System.out.println();
    }

}
public class Main {
    public static void main(String[] args) {

        MyArraylist arraylist = new MyArraylist();
        arraylist.getSize();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.printArr();
        arraylist.getSize();
        arraylist.remove(3);
        arraylist.printArr();
        arraylist.getSize();
        System.out.println(arraylist.getA(2));
        arraylist.setA(2,45);
        arraylist.printArr();

    }
}