# Iteration of Collection in Different Method
## 1. For-Each Loop (Enhanced for Loop)

   - Works with any Iterable (e.g., List, Set).
   - Simple and clean but doesn’t provide an index.
```java
import java.util.*;

public class ForEachLoopExample {
public static void main(String[] args) {
List<String> list = Arrays.asList("A", "B", "C");

        for (String element : list) {
            System.out.println(element);
        }
    }
}
```
## 2. For Index Loop (Only for List)

- Works with List since it provides indexed access.
- Allows modifying elements while iterating.
```java
import java.util.*;
public class ForIndexLoopExample {
public static void main(String[] args) {
List<String> list = Arrays.asList("A", "B", "C");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
```
## 3. Iterator
- Works with any Collection.
- Allows safe element removal during iteration.
```java
import java.util.*;
public class IteratorExample {
public static void main(String[] args) {
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // iterator.remove(); // Uncomment to remove elements while iterating
        }
    }
}
```
## 4. ListIterator (Only for List)

- Supports bidirectional traversal (hasPrevious()).
- Can modify elements (set() method).
```java
import java.util.*;
public class ListIteratorExample {
public static void main(String[] args) {
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
```
## 5. Enumeration (Legacy - for Vector & Hashtable)

- Used with older Java collections like Vector and Hashtable.
- Similar to Iterator, but lacks remove() method.
```java
import java.util.*;
public class EnumerationExample {
public static void main(String[] args) {
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
vector.add("C");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
```