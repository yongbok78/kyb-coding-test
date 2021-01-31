function solution(numbers) {
  var answer = new Set();
  for (var i = 1; i <= numbers.length; i++) {
    permutation(numbers.split(""), 0, numbers.length, i, answer);
  }
  return answer.size;
}

function permutation(arr, depth, n, r, primes) {
  if (depth === r) {
    let no = Number(arr.slice(0, r).join(""));
    if (isPrime(no)) primes.add(no);
    return;
  }

  for (var i = depth; i < n; i++) {
    swap(arr, depth, i);
    permutation(arr, depth + 1, n, r, primes);
    swap(arr, depth, i);
  }
}

function swap(arr, depth, i) {
  if (depth === i) return;
  let temp = arr[depth];
  arr[depth] = arr[i];
  arr[i] = temp;
}

function isPrime(value) {
  for (var i = 2; i < value; i++) {
    if (value % i === 0) {
      return false;
    }
  }
  return value > 1;
}

console.log(solution("17"));
console.log(solution("011"));
