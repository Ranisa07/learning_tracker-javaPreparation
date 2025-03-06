# Methods of Collections Class

The `Collections` class in Java is a utility class that provides static methods for operations on collections, such as sorting, searching, and synchronization.

## Common Methods in `Collections` Class

### 1. Sorting Methods
- `sort(List<T> list)`: Sorts the list in natural order.
- `sort(List<T> list, Comparator<? super T> c)`: Sorts the list using the specified comparator.

### 2. Searching Methods
- `binarySearch(List<? extends Comparable<? super T>> list, T key)`: Searches for the key using binary search.
- `binarySearch(List<T> list, T key, Comparator<? super T> c)`: Searches using a custom comparator.

### 3. Min/Max Methods
- `min(Collection<? extends T> coll)`: Returns the minimum element.
- `max(Collection<? extends T> coll)`: Returns the maximum element.
- `min(Collection<? extends T> coll, Comparator<? super T> comp)`: Returns the minimum using a custom comparator.
- `max(Collection<? extends T> coll, Comparator<? super T> comp)`: Returns the maximum using a custom comparator.

### 4. Filling & Copying Methods
- `fill(List<? super T> list, T obj)`: Replaces all elements with `obj`.
- `copy(List<? super T> dest, List<? extends T> src)`: Copies elements from `src` to `dest`.
- `nCopies(int n, T obj)`: Returns an immutable list with `n` copies of `obj`.

### 5. Reverse & Shuffle Methods
- `reverse(List<?> list)`: Reverses the order of the list.
- `shuffle(List<?> list)`: Randomly shuffles the list.
- `shuffle(List<?> list, Random rnd)`: Shuffles using a specified random generator.

### 6. Unmodifiable & Synchronized Methods
- `unmodifiableCollection(Collection<? extends T> c)`: Returns an unmodifiable collection.
- `unmodifiableList(List<? extends T> list)`: Returns an unmodifiable list.
- `synchronizedCollection(Collection<T> c)`: Returns a thread-safe collection.
- `synchronizedList(List<T> list)`: Returns a thread-safe list.

### 7. Disjoint Method
- `disjoint(Collection<?> c1, Collection<?> c2)`: Returns `true` if the two collections have no common elements.

### 8. Frequency Method
- `frequency(Collection<?> c, Object o)`: Returns the number of occurrences of `o` in `c`.

---

# Collections vs Collection

## `Collections`
- A **utility class** in `java.util` that provides static methods for manipulating collections.
- Methods include sorting, searching, synchronization, and other operations.
- Example: `Collections.sort(list);`

## `Collection`
- A **root interface** of the Java Collection Framework (JCF) that represents a group of objects.
- Extended by interfaces like `List`, `Set`, and `Queue`.
- Example: `Collection<String> coll = new ArrayList<>();`
