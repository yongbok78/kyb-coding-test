function solution(numbers) {
  var r = numbers
    .map((n) => "" + n)
    .sort((n1, n2) => parseInt(n2 + n1) - parseInt(n1 + n2))
    .join("");
  return r[0] === "0" ? "0" : r;
}

console.log(solution([6, 10, 2]));
console.log(solution([3, 30, 34, 5, 9]));
