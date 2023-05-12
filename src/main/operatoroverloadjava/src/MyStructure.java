// Mystructure interface:
// set size of items
// can get and set items at indicies inside the array bounds
// Has method for checking if item is in the structure
// setting and getting outside bounds throws some exception
// getting unset item or setting null item throws some exception


public class MyStructure<T> {

    final private T[] items;
    final int size;

    public MyStructure(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    public void set(int index, T item) {
        if (item == null) {
            throw new IllegalArgumentException("Should not populate with null");
        }
        items[index] = item;
    }

    public T get(int index) {
        if (items[index] == null) {
            throw new IllegalStateException("Not yet populated!");
        }
        return (T)items[index];
    }

    public boolean contains(T item) {
        for (T internalItem : items) {
            if (internalItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyStructure<String> struct = new MyStructure<>(5);
        struct.set(0, "Java");
        struct.set(1, "Är");
        struct.set(2, "Kul");
        struct.set(3, "Men");
        struct.set(4, "Kotlin är roligare");

        if (struct.contains("Java")) {
            System.out.println("Dags för ändring!");
        }
    }
}
