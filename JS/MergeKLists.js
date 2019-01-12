//  Merge k Sorted Lists
// Salesforce Hard

var mergeKLists = function(lists, lo = 0, hi = lists.length -1) {

    if (lists.length === 0) return null;
    if (lo === hi) return lists[lo];

    // Divide and Conquer

    const mid = Math.floor((lo + hi) /2);
    const left = mergeKLists(lists,lo,mid);
    const right = mergeKLists(lists, mid+1, hi);

    return mergeTwoLists(left,right);
};

const mergeTwoLists = (l1,l2) => {

    if (l1 === null) return l2;
    if (l2 === null) return l1;

    if (l1.val < l2.val) {
        l1.next = mergeTwoLists(l1.next,l2);
        return l1;
    } else {
        l2.next = mergeTwoLists(l1,l2.next);
        return l2;
    }

};

// The time complexity is O(N log k) and the space complexity is O(1)
