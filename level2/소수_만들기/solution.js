function solution(nums) {
  var answer = combitions(nums, 3)
    .map((a) => a.reduce((a, b) => a + b))
    .filter((v) => isPrime(v));

  return answer.length;
}

function combitions(arr, selectedCnt) {
  let results = [];
  if (selectedCnt === 1) return arr.map((v) => [v]);
  arr.forEach((v, i, a) => {
    let cutted = a.slice(i + 1);
    let coms = combitions(cutted, selectedCnt - 1);
    let newResults = coms.map((com) => [v, ...com]);
    results.push(...newResults);
  });
  return results;
}

function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
    if (n % i === 0) return false;
  }
  return true;
}

console.log(solution([1, 2, 3, 4]));
console.log(solution([1, 2, 7, 6, 4]));
