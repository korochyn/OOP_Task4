package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list1 = new MyLinkedList<String>(null, null, null, 0);
        System.out.println(list1);
        list1.insertFirst("qwertr");
        System.out.println(list1);
        list1.insertFirst("qwertr123");
        System.out.println(list1);
        list1.insertFirst("qwertr456");
        System.out.println(list1);
        list1.insertLast("sdcfg21");
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.getNodeValue(0));
        System.out.println(list1.getNodeValue(1));
        System.out.println(list1.getNodeValue(2));
        System.out.println(list1.getNodeValue(2));
        System.out.println(list1.getNodeValue(list1.size() - 1));
    }
}
