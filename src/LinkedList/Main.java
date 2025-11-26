import LinkedList.LinkedList;

void main() {
    LinkedList ll = new LinkedList(7);
    ll.append(5);
    ll.append(6);
    ll.prepend(3);
    ll.printList();
    System.out.println(ll.get(1).getValue());
}
