/**
 * @param {number} sx
 * @param {number} sy
 * @param {number} tx
 * @param {number} ty
 * @return {boolean}
 */
var reachingPoints = function(sx, sy, tx, ty) {
    while ((sx<tx) && (sy<ty)) {
        if(tx<ty) {
            ty %= tx;
        } else {
            tx %= ty;
        }
    }
    return ((sx===tx) && ((ty-sy)%sx === 0)
            || ((sy === ty) && (tx-sx)%sy===0))
};
