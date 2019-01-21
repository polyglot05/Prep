var Solution = function(nums) {
    this.nums = [...nums];
};

/**
 * Resets the array to its original configuration and return it.
 * @return {number[]}
 */
Solution.prototype.reset = function() {
    return this.nums;
};

/**
 * Returns a random shuffling of the array.
 * @return {number[]}
 */
Solution.prototype.shuffle = function() {
    let random = [];
    let numsCopy = [...this.nums];
    while(numsCopy.length > 0){
        let index = Math.floor(Math.random() * numsCopy.length);
        random.push(numsCopy[index]);
        numsCopy.splice(index, 1);
    }
    return random;
};
