// Working Heap Sort  (min sort)


function main(input) {
    let res = [];

    input = input.split('\n').map(Number);
    for (let i = 1; i< input.length ;i++) {
        res.push(input[i]);
        let resLen = res.length;
        if (resLen <= 2) {
            console.log(-1);
        } else if (resLen === 3){
            heapSort(res);
            console.log(res.join(' '));
        } else {
            heapSort(res);
            res.pop();
            console.log(res.join(' '));
        }
    }

}

/* to create MAX  array */
function heap_root(input, i,array_length) {
    var left = 2 * i + 1; // Left nodes
    var right = 2 * i + 2; // Right nodes
    var max = i; // Max is the root node

//
    if (left < array_length && input[left] < input[max]) { // min heap , for max heap  use input[left] > input[max]

        max = left;
    }

    if (right < array_length && input[right] < input[max])     {
/*       console.log(right,'-->', max);
       */
        max = right;
    }

    if (max != i) {
        swap(input, i, max);
        heap_root(input, max);
    }
}

function swap(input, index_A, index_B) {
    var temp = input[index_A];

    input[index_A] = input[index_B];
    input[index_B] = temp;
}

function heapSort(input) {

   var array_length = input.length;

    for (var i = Math.floor(array_length / 2); i >= 0; i -= 1)      {
        heap_root(input, i, array_length);
      }

    for (i = input.length - 1; i > 0; i--) {
        swap(input, 0, i);
        array_length--;


        heap_root(input, 0,array_length);
    }
}
