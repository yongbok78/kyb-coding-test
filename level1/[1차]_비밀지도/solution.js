function solution(n, arr1, arr2) {
  var answer = arr1.map((v, i) =>
    (v | arr2[i])
      .toString(2)
      .padStart(n, " ")
      .replace("0", " ")
      .replace(/1|0/g, (a) => (+a ? "#" : " "))
  );
  return answer;
}

console.log(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]));
console.log(solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]));
