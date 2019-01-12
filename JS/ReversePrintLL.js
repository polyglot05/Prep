// Print the LL in reverse
function reversePrint(head) {
    if (head.next !== null) {
        reversePrint(head.next);
    }
    console.log(head.data);

}
