class Start {
    public static void main(String[] data) {
        int[] a = { 8, 5, 1, 3, 5, 4, 8 };
        Manager m = new Manager();
        Element first = m.create(a);
        m.print(first);
        
        
    }
}

class Manager {
    Element create(int[] a) {
        if (a == null) return null;
        if (a.length == 0) return null;
        
        Element first = new Element();
        first.value = a[0];
        Element last = first;
        for(int i = 1; i < a.length; i++) {
            Element newly = new Element();
            newly.value = a[i];
            last.next = newly;
            last = newly;
        }
        
        return first;
    }
    
    void print(Element e) {
        for(Element current = e; current != null; current = current.next) {
            System.out.println(current.value);
        }
    }
}

class Element {
    int value;
    Element next;
}