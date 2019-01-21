/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
  if (k<0) return 0;
    let set = new Set(), res = new Set();
    for (let i=0;i<nums.length;i++) {
        if(set.has(nums[i]+k)) res.add(nums[i]+k);
        if(set.has(nums[i]-k)) res.add(nums[i]);
        set.add(nums[i]);
    }
    return res.size;
};
