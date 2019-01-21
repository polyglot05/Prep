// Leetcode Remove Duplicates from Sorted List II
// Salesforce

var deleteDuplicates = function(head) {

    // Create a new header
    let newHead = new ListNode();
    newHead.next = head;// Place the newly created node before of the head

    let pre = newHead; // Add a pointer to the newly created node.
    let curr = head; // Add a pointer to the head.
    let foundDuplicate = false;

    while (curr !== null && curr.next != null) { // While the curr and the next are not null
    // Compare the curr value and the next value
        while (curr.next!=null && curr.val === curr.next.val)
            {
                curr.next = curr.next.next;
                foundDuplicate = true;
            }
        if (foundDuplicate) {
            pre.next = curr.next;
            foundDuplicate = false; // Mark foundDuplicate as false
        } else {
            pre = pre.next;
        }
        curr = curr.next;
    }

    return newHead.next;
};
