var permute = function(nums) {
    if(nums.length === 1) return [nums];
    let result = [];
    nums.forEach(num => permute(nums.filter(e => e!==num)).forEach(arr => result.push([...arr, num])));
    return result;
};
