function minimumAbsoluteDifference(arr) {
arr.sort((a, b) => a - b);
var currDiff = arr[1] - arr[0];
for (let i = 2; i < arr.length; i++) {
	currDiff = Math.min(currDiff, arr[i] - arr[i - 1]);
}
return currDiff;
}
