const args = process.argv.slice(2);
let output = true;

const text = args[0];

for (let i = 0; i < text.length && output; i++) {
    const candidate = text[i];
    for (let j = i + 1; j < text.length && output; j++) {
        if (candidate === text[j]) {
            output = false;
        }
    }
}

console.log(output);
