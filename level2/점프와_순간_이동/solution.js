function solution(n) {
  return n.toString(2).replace(/0/g, "").length;
}

console.log(solution(5));
console.log(solution(6));
console.log(solution(5000));
