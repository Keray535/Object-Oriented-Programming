public class LinkedListProgram {

    interface List<T> {
        void append(T item);
        int size();
        boolean remove_first();
        boolean remove_last();
        boolean remove(T item);
        T get(int i);
    }

    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public String toString() {
            return data + (next != null ? " -> " + next.toString() : " -> null");
        }
    }

    // Einfach verkettete Liste
    public static class LinkedList<T> implements List<T> {
        Node<T> head = null;
        Node<T> tail = null;

        public void push_front(T item) {
            Node<T> neuerKnoten = new Node<>(item);
            if (head == null) {
                head = tail = neuerKnoten;
            } else {
                neuerKnoten.next = head;
                head = neuerKnoten;
            }
        }

        public void push_back(T item) {
            Node<T> neuerKnoten = new Node<>(item);
            if (head == null) {
                head = tail = neuerKnoten;
            } else {
                tail.next = neuerKnoten;
                tail = neuerKnoten;
            }
        }

        public void append(T item) {
            push_back(item);
        }

        public boolean remove_first() {
            if (head == null) return false;
            head = head.next;
            if (head == null) tail = null;
            return true;
        }

        public boolean remove_last() {
            if (head == null) return false;
            if (head == tail) {
                head = tail = null;
                return true;
            }
            Node<T> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            return true;
        }

        public boolean remove(T item) {
            if (head == null) return false;
            if (head.data.equals(item)) return remove_first();

            Node<T> current = head;
            while (current.next != null) {
                if (current.next.data.equals(item)) {
                    current.next = current.next.next;
                    if (current.next == null) {
                        tail = current;
                    }
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public int size() {
            int count = 0;
            Node<T> current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public T get(int i) {
            Node<T> current = head;
            int count = 0;
            while (current != null) {
                if (count == i) return current.data;
                current = current.next;
                count++;
            }
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        public String toString() {
            return head != null ? head.toString() : "empty list";
        }
    }

    // Doppelt verkettete Liste
    public static class DoubleLinkedList<T> implements List<T> {
        Node<T> head = null;
        Node<T> tail = null;

        public void push_front(T item) {
            Node<T> neuerKnoten = new Node<>(item);
            if (head == null) {
                head = tail = neuerKnoten;
            } else {
                neuerKnoten.next = head;
                head.prev = neuerKnoten;
                head = neuerKnoten;
            }
        }

        public void push_back(T item) {
            Node<T> neuerKnoten = new Node<>(item);
            if (tail == null) {
                head = tail = neuerKnoten;
            } else {
                neuerKnoten.prev = tail;
                tail.next = neuerKnoten;
                tail = neuerKnoten;
            }
        }

        public void append(T item) {
            push_back(item);
        }

        public boolean remove_first() {
            if (head == null) return false;
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return true;
        }

        public boolean remove_last() {
            if (tail == null) return false;
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
            return true;
        }

        public boolean remove(T item) {
            Node<T> current = head;
            while (current != null) {
                if (current.data.equals(item)) {
                    if (current.prev != null) current.prev.next = current.next;
                    else head = current.next;

                    if (current.next != null) current.next.prev = current.prev;
                    else tail = current.prev;

                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public int size() {
            int count = 0;
            Node<T> current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public T get(int i) {
            Node<T> current = head;
            int count = 0;
            while (current != null) {
                if (count == i) return current.data;
                current = current.next;
                count++;
            }
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        public String toString() {
            return head != null ? head.toString() : "empty list";
        }
    }

    public static void main(String[] args) {
        System.out.println("Einfach verkettete Liste:");
        LinkedList<String> liste = new LinkedList<>();
        liste.append("A");
        liste.append("B");
        liste.append("C");
        liste.append("D");

        System.out.println("Liste: " + liste);
        liste.remove("C");
        System.out.println("Nach remove(\"C\"): " + liste);
        liste.remove_first();
        System.out.println("Nach remove_first(): " + liste);
        liste.remove_last();
        System.out.println("Nach remove_last(): " + liste);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println("Element " + i + ": " + liste.get(i));
        }

        System.out.println("\nDoppelt verkettete Liste:");
        DoubleLinkedList<String> dlist = new DoubleLinkedList<>();
        dlist.append("X");
        dlist.append("Y");
        dlist.append("Z");
        System.out.println("DoubleList: " + dlist);
        dlist.remove_last();
        System.out.println("Nach remove_last(): " + dlist);
        dlist.remove_first();
        System.out.println("Nach remove_first(): " + dlist);
    }
}
