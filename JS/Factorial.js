function main(input) {
    const num = parseInt(input, 10);
    console.log(fact(num));
}

function fact (n) {
    let factorial = (n === 0) ? 1 : n*fact(n-1);
    return factorial;
}
