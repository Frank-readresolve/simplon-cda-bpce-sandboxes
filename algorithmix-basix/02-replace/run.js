const args = process.argv.slice(2);
let output = "";

const text = args[0];
const char = args[1];
const sub = args[2];

for (let i = 0; i < text.length; i++) {
    const candidate = text[i];
    if (candidate === char) {
        output += sub;
    } else {
        output += candidate;
    }
}

console.log(output);
