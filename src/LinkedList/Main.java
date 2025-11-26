import LinkedList.LinkedList;

void main() {
    LinkedList ll = new LinkedList(7);
    ll.append(5);
    ll.append(6);
    System.out.println(ll.removeLast());

    ll.removeLast();
    ll.removeLast();
    System.out.println(ll.removeLast());
    ll.printList();
}
