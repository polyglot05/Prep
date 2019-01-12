// Complete the maxSubsetSum function below.
function maxSubsetSum(arr) {
let max = new MaxPair(arr[0]);
for (let i = 1; i < arr.length; i++) {
max = new MaxPair(arr[i], max);
}
return Math.max(
max.usingThisElementMax,
max.notUsingThisElementMax
);
}

function MaxPair(currentElement,
lastMaxPair = {
usingThisElementMax: 0,
notUsingThisElementMax: 0
})
{
this.usingThisElementMax = Math.max(
currentElement,
currentElement + lastMaxPair.notUsingThisElementMax
);
this.notUsingThisElementMax = Math.max(
lastMaxPair.usingThisElementMax,
lastMaxPair.notUsingThisElementMax
);
}
