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
