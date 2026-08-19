const args = process.argv.slice(2);
let output = "";

const text = args[0];

for (let i = text.length - 1; i >= 0; i--) {
    output += text[i];
}

console.log(output);
