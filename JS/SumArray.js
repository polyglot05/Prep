Javascript .reduce example for calculating sum of an array:
arr = [1,2,3,4]

sum = arr.reduce((acc, val) => {
  return acc + val;
})

// The same can be written in plain JS as:
arr = [1, 2, 3, 4];
sum = 0;
for(var i = 0; i < arr.length; i++) {
    sum += arr[i];
}
