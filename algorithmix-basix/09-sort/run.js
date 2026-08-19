const args = process.argv.slice(2);
const output = args[0].split(",").map(Number);

let n = output.length;
let swapped;

do {
    swapped = false;
    for (let i = 1; i < n; i++) {
        if (output[i - 1] > output[i]) {
            const temp = output[i - 1];
            output[i - 1] = output[i];
            output[i] = temp;
            swapped = true;
        }
    }
} while (swapped);

console.log(output);
