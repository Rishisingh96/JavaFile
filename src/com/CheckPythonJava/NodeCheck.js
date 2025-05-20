const start = Date.now();

let sum = 0;
for (let i = 1; i <= 100000000; i++) {
    sum += i;
}

const end = Date.now();

console.log("Sum of 1 to 100000000:", sum);
console.log("Time taken to execute the code is:", (end - start), "ms");
