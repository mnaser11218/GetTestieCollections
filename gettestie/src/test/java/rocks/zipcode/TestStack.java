package rocks.zipcode;


import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    // testing hashset

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestStackPopMethod() {
        //stack ensures fifo (first in, first out)
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("testing 2");
        stack.push("testing 3");
        stack.push("testing 4");

        String poppedElement = stack.pop();

        assertEquals("testing 4", poppedElement); // false
    }

    @org.junit.Test
    public void TestHashSetUniqueOnlyElements() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        HashSet<String> cars = new HashSet<String>();
        // test if you're able to add two of the same elements.
        cars.add("Hello world");
        cars.add("Hello world");
        cars.add("Hello world");
        cars.add("Hello world");
        int carSize = cars.size();

        assertEquals(1, carSize); // false
    }

    @org.junit.Test
    public void TestHashSetAddMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        HashSet<String> cars = new HashSet<String>();
        // test if you're able to add two of the same elements.
        cars.add("Hello world");
        cars.add("Hello" );
        cars.add(" world");
        cars.add("Hed");
        int carSize = cars.size();

        assertEquals(4, carSize); // false
    }

    @org.junit.Test
    public void TestHashSetContains3() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        HashSet<String> cars = new HashSet<String>();
        // test if you're able to add two of the same elements.
        cars.add("Hello world");
        cars.add("Hello" );
        cars.add(" world");
        cars.add("Hed");
        int carSize = cars.size();

        assertEquals(4, carSize); // false
    }

    @org.junit.Test
    public void TestHashSetClearMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        HashSet<String> cars = new HashSet<String>();
        // test if you're able to add two of the same elements.
        cars.add("Hello world");
        cars.add("Hello" );
        cars.add(" world");
        cars.add("Hed");
        cars.clear();
        int carSize = cars.size();

        assertEquals(0, carSize); // false
    }

    // TESTING ARRAYLIST INTERFACE
     // its methods: add, contains, remove, clear

    @org.junit.Test
    public void TestArrayListAddMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        ArrayList<String> cars = new ArrayList<String>();
        // test if you're able to add two of the same elements.
        cars.add("Hello world");
        cars.add("Hello" );
        cars.add(" world");
        cars.add("Hed");
        //cars.clear();
        int carSize = cars.size();

        assertEquals(4, carSize); // false
    }

    @org.junit.Test
    public void TestArrayListRemoveMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        ArrayList<String> cars = new ArrayList<String>();
        // test if you're able to add two of the same elements.
        cars.add("Hello world");
        cars.add("Hello" );
        cars.add(" world");
        cars.add("Hed");
        String removedElement = cars.remove(0);
        int carSize = cars.size();

        assertEquals("Hello world", removedElement); // false
    }

    // FOR THE MAP INTERFACE, HASHMAP IS THE MOST COMMONLY USED IMPLEMENTATION
    // put, get, remove, clear, size

    @org.junit.Test
    public void TestHashMapPutMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        HashMap<String, Integer> cars = new HashMap<>();
        // test if you're able to add two of the same elements.
        cars.put("Hello world", 4);
        cars.put("Hello",7 );
        cars.put(" world", 9);
        cars.put("Hed", 0);
        int carSize = cars.size();

        assertEquals(4, carSize); // false
    }


    @org.junit.Test
    public void TestHashMapRemoveMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        HashMap<String, Integer> cars = new HashMap<>();
        // test if you're able to add two of the same elements.
        cars.put("Hello world", 4);
        cars.put("Hello",7 );
        cars.put(" world", 9);
        cars.put("Hed", 0);
        cars.remove("Hello");
        Object removedValue = cars.get("Hello");
        assertEquals(null, removedValue); // false
    }


    // For the Queue interface, LinkedList is the most commonly used implementation.
    //addFirst()	Adds an item to the beginning of the list
    //addLast()	Add an item to the end of the list
    //removeFirst()	Remove an item from the beginning of the list
    //removeLast()	Remove an item from the end of the list
    //getFirst()	Get the item at the beginning of the list
    //getLast()	Get the item at the end of the list

    @org.junit.Test
    public void TestLinkedListGetFirstMethod() {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        String firstElement = cars.getFirst();
        assertEquals("Toyota", firstElement); // false
    }

    @org.junit.Test
    public void TestLinkedListGetLastMethod() {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        String firstElement = cars.getLast();
        assertEquals("Hyundai", firstElement); // false
    }

    @org.junit.Test
    public void TestLinkedListRemoveFirstMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        LinkedList<String> cars = new LinkedList<>();
        // test if you're able to add two of the same elements.
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.removeFirst();
        Object firstElement = cars.getFirst();
        assertEquals("Mazda", firstElement); // false
    }

    @org.junit.Test
    public void TestLinkedListAddLastMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        LinkedList<String> cars = new LinkedList<>();
        // test if you're able to add two of the same elements.
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.addLast("Ferrari");
        Object lastElement = cars.getLast();
        assertEquals("Ferrari", lastElement); // false
    }


    //For the Deque interface, ArrayDeque is the most commonly used implementation.


    @org.junit.Test
    public void TestArrrayDequeAddLastMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        LinkedList<String> cars = new LinkedList<>();
        // test if you're able to add two of the same elements.
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.addLast("Ferrari");
        Object lastElement = cars.getLast();
        assertEquals("Ferrari", lastElement); // false
    }

    @org.junit.Test
    public void TestArrrayDequeClearMethod() {
        // hashset is a collection of items where every item is unique
        // its methods: add, contains, remove, clear
        LinkedList<String> cars = new LinkedList<>();
        // test if you're able to add two of the same elements.
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.addLast("Ferrari");
        cars.clear();
        assertEquals(0, cars.size()); // false
    }

    //Vector

    @org.junit.Test
    public void TestVectorAddLastMethod() {

        Vector<String> cars = new Vector<String>();

        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.add("Ferrari");
        String lastElement = cars.lastElement();
        assertEquals("Ferrari", lastElement); // false
    }


    //TreeMap
//    The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time,
//    depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs.
    @org.junit.Test
    public void TestTreeMapAddMethod() {

        TreeMap<String, Integer> cars = new TreeMap<String, Integer>();

        cars.put("Toyota", 5);
        cars.put("Mazda", 3);
        cars.put("Nissan", 8);
        cars.put("Hyundai", 90);
        cars.put("Ferrari", 67);
        String entrySet = cars.entrySet().toString();
        assertEquals("[Ferrari=67, Hyundai=90, Mazda=3, Nissan=8, Toyota=5]", entrySet); // false
    }

        // Stack
//    The class is based on the basic principle of last-in-first-out.
//    In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek


    @org.junit.Test
    public void TestStackAddMethod() {

        Stack<String> cars = new Stack<String>();

        cars.push("Toyota");
        cars.push("Mazda");
        cars.push("Nissan");
        cars.push("Hyundai");
        cars.push("Ferrari");
        String peekEnd = cars.peek();
        assertEquals("Ferrari", peekEnd); // false
    }

    // TreeSet


    @org.junit.Test
    public void TestTreeSetAddMethod() {

        TreeSet<String> cars = new TreeSet<String>();

        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.add("Ferrari");
        String peekEnd = cars.last();
        assertEquals("Toyota", peekEnd); // false
    }

    // Iterator

    @org.junit.Test
    public void testIteratorMethod() {

        TreeSet<String> cars = new TreeSet<String>();


        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.add("Ferrari");

        Iterator<String>it= cars.iterator();
        // print out all elements in car through iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

    //PriorityQueue

    @org.junit.Test
    public void testPriorityQueue() {

        PriorityQueue<String> cars = new PriorityQueue<String>();




        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Nissan");
        cars.add("Hyundai");
        cars.add("Ferrari");

        String peekEnd = cars.peek();
        assertEquals("Ferrari", peekEnd);
    }


    // Comparable
    @org.junit.Test
    public void testComparable() {

        int n = 4;
       Person arr[] = new Person[n];
//
        arr[0] = new Person("bsadfas", 3);
        arr[1] = new Person("dasdfasd", 4);
        arr[2] = new Person("cadfsas", 5);
        arr[3] = new Person("afdas", 2);
       // before sort
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        String sortedArray = Arrays.toString(arr);
        assertEquals("[Name: afdas\n" +
            "Year of birth: 2\n" +
            ", Name: bsadfas\n" +
            "Year of birth: 3\n" +
            ", Name: cadfsas\n" +
            "Year of birth: 5\n" +
            ", Name: dasdfasd\n" +
            "Year of birth: 4\n" +
            "]" , sortedArray);
    }


}


