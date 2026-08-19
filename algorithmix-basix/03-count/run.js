const args = process.argv.slice(2);
let output = 0;

const text = args[0];
const char = args[1];

for (let i = 0; i < text.length; i++) {
    const candidate = text[i];
    if (candidate === char) {
        output++;
    }
}

console.log(output);
