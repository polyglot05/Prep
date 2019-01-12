// LRU Cache Javascript



/**
 * @param {number} capacity
 */
var LRUCache = function(capacity) {
    this.capacity = capacity; // Initialize the capacity
    this.map = new Map(); // create a new map

};

/**
 * @param {number} key
 * @return {number}
 */
LRUCache.prototype.get = function(key) {
    let value =  this.map.get(key);
    if (typeof value === 'undefined') { return -1; }
    this.map.delete(key);
    this.map.set(key,value);
    return value;

};

/**
 * @param {number} key
 * @param {number} value
 * @return {void}
 */
LRUCache.prototype.put = function(key, value) {
    if (this.map.has(key)) {this.map.delete(key);}
    this.map.set(key,value);
    let keys = this.map.keys();
    while(this.map.size > this.capacity) {this.map.delete(keys.next().value) }

};

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = Object.create(LRUCache).createNew(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
