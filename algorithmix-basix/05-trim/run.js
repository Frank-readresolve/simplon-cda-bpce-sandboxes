const args = process.argv.slice(2);
let output = "";

const text = args[0];

let start = 0;
let end = text.length - 1;

while (start <= end && text[start] === " ") {
    start++;
}

while (end >= start && text[end] === " ") {
    end--;
}

for (let i = start; i <= end; i++) {
    output += text[i];
}

// Leave the single quotation marks in order
// to see potential whitespaces in the output
console.log("'" + output + "'");
