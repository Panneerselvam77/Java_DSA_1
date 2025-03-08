
public class LinkList {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(6);
        nums.add(9);
        nums.firstAdd(10);
        nums.firstAdd(11);

        nums.delete(10);
        nums.delete(11);
        nums.display();

    }
}
