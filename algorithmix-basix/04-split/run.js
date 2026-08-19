const args = process.argv.slice(2);
let output = [];

const text = args[0];
const delimiter = args[1];

let elementIndex = 0;
let element = "";

for (let i = 0; i < text.length; i++) {
    const candidate = text[i];
    if (candidate !== delimiter) {
        element += candidate;
    } else {
        output[elementIndex] = element;
        elementIndex++;
        element = "";
    }
}

output[elementIndex] = element;

console.log(output);
