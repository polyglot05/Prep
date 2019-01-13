function fibonacci(num) {
  if (num <= 1) return 1;

  return fibonacci(num - 1) + fibonacci(num - 2);
}
// (2^N) time complexity, which means that our current implementation is exponential…

// Memoization : Is an optimization technique used primarily to speed up computer programs by storing the results of expensive function calls.

function fibonacci(num, memo) {
  memo = memo || {};

  if (memo[num]) return memo[num];
  if (num <= 1) return 1;

  return memo[num] = fibonacci(num - 1, memo) + fibonacci(num - 2, memo);
}

// space complexity of our new algorithm to O(n) but will dramatically decrease the time complexity to 2N which will resolve to linear time since 2 is a constant.

// While loop :
function fibonacci(num){
  var a = 1, b = 0, temp;

  while (num >= 0){
    temp = a;
    a = a + b;
    b = temp;
    num--;
  }

  return b;
}
// Time complexity: O(N)
// Space complexity: Constant
