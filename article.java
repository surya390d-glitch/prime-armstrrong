2. Find the majority element (appears more than n/2 times)
Input: {2, 2, 1, 2, 2}

Output: 2

// Function to calculate x raised 
// to the power y 
function power(x, y) {
    if (y === 0)
        return 1;
    if (y % 2 === 0)
        return power(x, Math.floor(y / 2)) * power(x, Math.floor(y / 2));
    return x * power(x, Math.floor(y / 2)) * power(x, Math.floor(y / 2));
}

// Function to count number of digits in n
function order(n) {
    let t = 0;
    while (n !== 0) {
        t++;
        n = Math.floor(n / 10);
    }
    return t;
}

// Function to check whether the given 
// number is Armstrong number or not
function armstrong(n) {
    
    // Calling order function
    let x = order(n);
    let temp = n, sum = 0;
    while (temp !== 0) {
        let r = temp % 10;
        sum += power(r, x);
        temp = Math.floor(temp / 10);
    }

    // If satisfies Armstrong condition
    return sum === n;
}

// Driver Code
let n = 153;
if (armstrong(n)) {
    console.log("true");
} else {
    console.log("false");
}
function armstrong(n) {
    // converting to string
    let number = n.toString();

    let length = number.length;
    let output = 0;

    for (let i of number) {
        output += Math.pow(parseInt(i), length);
    }

    // check if equal to number
    if (output === parseInt(number))
        return true;
    else
        return false;
}

// Driver Code
let n = 153;
if (armstrong(n)) {
    console.log("true");
} else {
    console.log("false");
}
