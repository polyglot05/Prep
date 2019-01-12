
function CompareLists(llist1, llist2) {
    while (llist1 != null && llist2 != null && llist1.data == llist2.data) {
        llist1 = llist1.next;
        llist2 = llist2.next;
    }
    return llist1 == llist2;
}
