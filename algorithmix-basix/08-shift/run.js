const args = process.argv.slice(2);
let output = [];

const text = args[0]; // ABCDE
const shift = parseInt(args[1], 10); // 2

const length = text.length;
for (let i = 0; i < length; i++) {
    const index = (i + shift) % length;
    output[index] = text[i];
}

console.log(output); // [ 'D', 'E', 'A', 'B', 'C' ]
