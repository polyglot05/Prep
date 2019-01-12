function mergeLists(head1, head2) {
    // Create a new node to hold the merged list contents
    let mergedList = new SinglyLinkedListNode();
    let ptr = mergedList; // Create a pointer to the newly created list

    while (head1 !== null && head2 != null) {
        // Check if the head1 data is less than head2
        if (head1.data < head2.data) {
            // The ptr.next will now point to head1.data to retain the ascending order
            ptr.next = new SinglyLinkedListNode(head1.data);
            head1 = head1.next;
        } else {
            ptr.next = new SinglyLinkedListNode(head2.data);
            head2 = head2.next;
        }
        ptr = ptr.next;
    }
    ptr.next = (head1 != null) ? head1 : head2;
    return mergedList.next;

}
