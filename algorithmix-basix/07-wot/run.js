const args = process.argv.slice(2);
let output = "";

const delay = parseInt(args[0], 10); // in minutes per day (>= 0)
const duration = parseInt(args[1], 10); // in weeks (>= 1)
const unit = args[2] || "M"; // D, H or [M]

let waste = (delay * 5) * duration; // minutes (M)

if (unit === "D") {
    waste /= 420; // 60 * 7 working hours a day
} else if (unit === "H") {
    waste /= 60; // 60 minutes in 1 hour
}

output = `Waste of time: ${waste} ${unit}`;

console.log(output);
