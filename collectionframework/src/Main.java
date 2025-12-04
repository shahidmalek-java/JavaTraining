import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;



//class Person {
//    String name;
//    int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return name + "(" + age + ")";
//    }
//}





//class Task {
//    String name;
//    int priority;  // Lower number = higher priority
//
//    Task(String name, int priority) {
//        this.name = name;
//        this.priority = priority;
//    }
//
//    @Override
//    public String toString() {
//        return name + "(Priority: " + priority + ")";
//    }
//}



//class StringLengthComparator implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
//        int lenCompare = Integer.compare(s1.length(), s2.length());
//        if (lenCompare != 0)
//            return lenCompare;   // Sort by length first
//
//        return s1.compareTo(s2); // If length same, sort alphabetically
//    }
//}


public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(0,11);
        l1.add(1,22);
        l1.add(2,33);
        l1.add(3,44);
        l2.add(0,12);
        l2.add(1,22);
        l2.add(2,35);
        l2.add(3,44);

//        System.out.println("List : ");
//        System.out.println(l1);

//        for (int i = 0 ; i <l1.size();i++)
//        {
//            int a =l1.get(i);
//            if(a%2!=0)
//            {
//                l1.remove(i);
//            }
//        }
//        l1.removeIf(integer -> integer % 2 !=0);
//        System.out.println(l1);

//        int l = l1.size();
//        int[] arr=new int[l];
//        for(int i = 0; i<l ; i++)
//        {
//            arr[i]=l1.get(i);
//            System.out.println(arr[i]);
//        }

//        System.out.println(l1.contains(33));

//        l1.retainAll(l2);
//        System.out.println(l1);


//        l1.addAll(l2);
//        System.out.println(l1);


       // l1.forEach(integer -> System.out.println(integer));

//        l1.addAll(l2);
//        System.out.println(l1.containsAll(l2));

//        List<String> list = new ArrayList<>();
//        list.add(0,"shahid");
//        list.add(0,"Bhargav");
//        list.add(0,"vikas");
//        list.sort(null);
//        System.out.println(list);

//        l1.set(2,55);
//        System.out.println("Updated List : ");
//        System.out.println(l1);


//        ListIterator li = l1.listIterator();
//
//        while (li.hasNext())
//        {
//            System.out.println(li.next());
//        }
//        while (li.hasPrevious())
//        {
//            System.out.println(li.previous());
//        }


//        HashSet<Integer> h1 = new HashSet<>();
//
//        h1.add(5);
//        h1.add(10);
//        h1.add(20);
//        h1.add(25);
//        h1.add(20);
//        h1.add(5);
//        h1.add(55);
//
//        System.out.println(h1);


//        LinkedList<Character> ll = new LinkedList<>();
//        ll.add(0,'a');
//        ll.add(1,'b');
//        ll.add(2,'c');
//        System.out.println(ll);
//
//        ll.toArray();
//        System.out.println(ll);



//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(0,10);
//        ll.add(1,15);
//        ll.add(2,50);
//        ll.add(3,20);
//
//        System.out.println(ll);
//        ll.push(5);
//        System.out.println(ll);
//        System.out.println( ll.peek());
//        ll.pop();
//        System.out.println(ll);


//        Collections.sort(l1);
//
//        int in = Collections.binarySearch(l1,44);
//        System.out.println(in);

//        Thread t1 = new Thread(()->{
//            synchronized (l1){
//                System.out.println(l1);
//            }
//        });
//        t1.start();
//
//        System.out.println(Collections.synchronizedList(l1));



//        try {
//            List<Integer> immutable = List.of(10,20,30,40);
//            System.out.println(immutable);
//
//            System.out.println("Try to put element...");
//            immutable.add(4,50);
//        }catch (UnsupportedOperationException e)
//        {
//            System.out.println("Exception : "+e);
//        }


//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(10);
//        pq.add(5);
//        pq.add(55);
//        pq.add(15);
//        System.out.println(pq);



//        Comparator<Person> ageComparator = (p1, p2) -> p1.age - p2.age;
//
//        PriorityQueue<Person> pq = new PriorityQueue<>(ageComparator);
//
//        pq.add(new Person("Alice", 30));
//        pq.add(new Person("Bob", 25));
//        pq.add(new Person("Charlie", 35));
//
//        // Poll elements to see the order
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }


//        ArrayDeque<Integer> que = new ArrayDeque<>();
//        que.add(20);
//        System.out.println(que);
//        que.add(5);
//        System.out.println(que);
//        que.add(1);
//        System.out.println(que);
//        que.add(50);
//        System.out.println(que);
//        System.out.println(que.peek());
//        que.remove();
//        System.out.println(que);
//        que.remove();
//        System.out.println(que);



//        PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));
//
//        // Adding tasks
//        pq.add(new Task("Write report", 3));
//        pq.add(new Task("Fix bugs", 1));
//        pq.add(new Task("Team meeting", 2));
//        pq.add(new Task("Code review", 1));
//
//        System.out.println("Executing tasks in priority order:");
//
//        // Poll tasks from queue
//        while (!pq.isEmpty()) {
//            Task task = pq.poll();
//            System.out.println(task);
//        }



//        Queue<Integer> queue =new LinkedList<>();
//        queue.add(10);
//        System.out.println(queue);
//        queue.add(20);
//        System.out.println(queue);
//        queue.add(100);
//        System.out.println(queue);
//        queue.add(1000);
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.peek());
//        queue.poll();
//        System.out.println(queue);
//        queue.poll();
//        System.out.println(queue);



//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(10);
//        hashSet.add(20);
//        hashSet.add(50);
//        hashSet.add(20);
//        hashSet.add(5);
//        hashSet.add(10);
//        hashSet.add(101);
//        System.out.println(hashSet);
//
//        Iterator<Integer> iterator = hashSet.iterator();
//        while (iterator.hasNext())
//        {
//            int a = iterator.next();
//            System.out.println(a);
//        }



//        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add(10);
//        linkedHashSet.add(20);
//        linkedHashSet.add(50);
//        linkedHashSet.add(20);
//        linkedHashSet.add(5);
//        linkedHashSet.add(10);
//        linkedHashSet.add(101);
//        System.out.println(linkedHashSet);


//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(20);
//        treeSet.add(5);
//        treeSet.add(28);
//        treeSet.add(10);
//        treeSet.add(200);
//        treeSet.add(20);
//        treeSet.add(28);
//        System.out.println(treeSet);



//        TreeSet<String> set = new TreeSet<>(new StringLengthComparator());
//
//        set.add("Apple");
//        set.add("Dog");
//        set.add("Banana");
//        set.add("Cat");
//        set.add("Kiwi");
//
//        System.out.println(set);



//        Set<Integer> set1 = new HashSet<>();
//        Collections.addAll(set1,1,2,3,4);
//        Set<Integer> set2 = new HashSet<>();
//        Collections.addAll(set2,3,4,5,6);
//        System.out.println(set1);
//        System.out.println(set2);
//
//        Set<Integer> union = new HashSet<>(set1);
//        union.addAll(set2);
//        System.out.println("union : "+union);
//
//        Set<Integer> intersect = new HashSet<>(set1);
//        intersect.retainAll(set2);
//        System.out.println("Intersect : "+intersect);
//
//        Set<Integer> diff = new HashSet<>(set1);
//        diff.removeAll(set2);
//        System.out.println("Difference : "+diff);




//        Set<Integer> set1 = new HashSet<>();
//        Collections.addAll(set1,1,2,3,4,5,6,7);
//        Set<Integer> set2 = new HashSet<>();
//        Collections.addAll(set2,3,4,5,6);
//
//        System.out.println("s1 is super set s2 : "+set1.containsAll(set2));
//
//        System.out.println("s1 is sub Set set s2 : "+set2.containsAll(set1));


//        System.out.println(l1);
//        l1.removeIf(integer -> integer%2==0);
//        System.out.println(l1);



//        HashMap<String,Integer> person = new HashMap<>();
//        person.put("Shahid", 21);
//        person.put("Bhargav", 20);
//        person.put("tushar", 22);
//        person.put("vikas", 25);
//        System.out.println(person);



//        System.out.println(person.keySet());
//        System.out.println(person.values());


//        System.out.println(person.getOrDefault("Shahid",0));
//        System.out.println(person.getOrDefault("vikas",0));


//        System.out.println("Remove by key");
//        person.remove("tushar");
//        System.out.println(person);
//
//        System.out.println("Remove by key-value");
//        person.remove("vikas",25);
//        System.out.println(person);



//        TreeMap<String,Integer> treeMap = new TreeMap<>();
//        treeMap.put("Shahid",21);
//        treeMap.put("Tushar",25);
//        treeMap.put("Bhargav",30);
//        treeMap.put("Arbaz",26);
//
//        System.out.println(treeMap);



//        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
//        lh.put("Shahid", 21);
//        System.out.println(lh);
//        lh.put("Tushar", 26);
//        System.out.println(lh);
//        lh.put("Arbaz", 25);
//        System.out.println(lh);
//        lh.put("Bhargav", 20);
//        System.out.println(lh);



//        Map<String,List<String>> map = new HashMap<>();
//
//        map.computeIfAbsent("Fruits",k -> new ArrayList<>()).add("Banana");
//        map.computeIfAbsent("Fruits",k -> new ArrayList<>()).add("Apple");
//        map.computeIfAbsent("Fruits",k -> new ArrayList<>()).add("Water Melon");
//
//        System.out.println(map);



//        String str = "hello world";
//
//        Map<Character, Integer> freq = new HashMap<>();
//
//        for (char ch : str.toCharArray()) {
//            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//        }
//
//        System.out.println(freq);




//        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
//        lh.put("Shahid", 21);
//        System.out.println(lh);
//        lh.put("Tushar", 26);
//        System.out.println(lh);
//        lh.put("Arbaz", 25);
//        System.out.println(lh);
//        lh.put("Bhargav", 20);
//        System.out.println(lh);

//        lh.replaceAll((Key, Value)->Value+10);
//        System.out.println(lh);



//        LinkedHashMap<String,Integer> lh2 = new LinkedHashMap<>();
//        lh2.put("Kamil", 21);
//        System.out.println(lh);
//        lh2.put("Has", 26);
//        System.out.println(lh);
//        lh2.put("No", 25);
//        System.out.println(lh);
//        lh2.put("KJkih", 20);
//        System.out.println(lh);
//
//        lh.putAll(lh2);
//        System.out.println(lh);



//        Enumeration<String> days;
//        Vector<String> dayNames = new Vector<>();
//        dayNames.add("Sunday");
//        dayNames.add("Monday");
//        dayNames.add("Tuesday");
//        dayNames.add("Wednesday");
//        dayNames.add("Thursday");
//        dayNames.add("Friday");
//        dayNames.add("Saturday");
//        days= dayNames.elements();
//
//
//        while (days.hasMoreElements())
//        {
//            System.out.println(days.nextElement());
//        }




//        List<String> dayNames = Arrays.asList(
//                "Sunday", "Monday", "Tuesday", "Wednesday",
//                "Thursday", "Friday", "Saturday"
//        );
//
//        // Get iterator
//        Iterator<String> it = dayNames.iterator();
//
//        // Convert Iterator to Enumeration
//        Enumeration<String> days = new Enumeration<>() {
//            public boolean hasMoreElements() { return it.hasNext(); }
//            public String nextElement() { return it.next(); }
//        };
//
//        // Print elements
//        while (days.hasMoreElements()) {
//            System.out.println(days.nextElement());
//        }



//        Hashtable<Integer, String> hashtable = new Hashtable<>();
//        hashtable.put(1, "Apple");
//        hashtable.put(2, "Banana");
//        hashtable.put(3, "Cherry");
//
//        // Get an Enumeration of the keys
//        Enumeration<Integer> keys = hashtable.keys();
//
//        System.out.println("Hashtable elements:");
//
//        // Iterate using Enumeration
//        while (keys.hasMoreElements()) {
//            Integer key = keys.nextElement();
//            String value = hashtable.get(key);
//            System.out.println(key + " : " + value);
//        }




//        Vector<String> days = new Vector<>();
//        days.add("Sunday");
//        days.add("Monday");
//        days.add("Tuesday");
//        days.add("Wednesday");
//        days.add("Thursday");
//        days.add("Friday");
//        days.add("Saturday");
//
//        // Get Enumeration of constants
//        Enumeration<String> dayEnum = days.elements();
//
//        System.out.println("Custom enum-like constants:");
//        while (dayEnum.hasMoreElements()) {
//            System.out.println(dayEnum.nextElement());
//        }








    }


}