function getNode(head, positionFromTail) {
    let count = 0;
    let curr = head;
    while (head) {
        if (count > positionFromTail) {
            curr = curr.next;
        }
        head = head.next;
        count++;
    }
    return curr.data;
}
