/**
 * Initialize your data structure here.
 */
var MyHashMap = function() {
    // Create an empty aay of length 1000
    this.mySet = Array.from({length:1000}, x=>[]);
    // Create a map function to generate
    this.myMap = function(key) {
        return key % 1000;
    }
};

/**
 * value will always be non-negative.
 * @param {number} key
 * @param {number} value
 * @return {void}
 */
MyHashMap.prototype.put = function(key, value) {
    let arr = this.mySet[this.myMap(key)];
    let index = arr.indexOf(key);
    // If the element is not present add it
    if (index === -1) arr.push(key, ''+value);
    else {
        // Otherwise update the value
        arr.splice(index + 1,1,''+value);
    }

};

/**
 * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
 * @param {number} key
 * @return {number}
 */
MyHashMap.prototype.get = function(key) {

    let arr =  this.mySet[this.myMap(key)];
    let index = arr.indexOf(key);
    // If the element is found, return it else return -1
    if (index!==-1) return +arr[index+1];
    else return -1;

};

/**
 * Removes the mapping of the specified value key if this map contains a mapping for the key
 * @param {number} key
 * @return {void}
 */
MyHashMap.prototype.remove = function(key) {
    let arr = this.mySet[this.myMap(key)];
    let index = arr.indexOf(key);
    if (index!==-1) arr.splice(index,2);

};

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = Object.create(MyHashMap).createNew()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
