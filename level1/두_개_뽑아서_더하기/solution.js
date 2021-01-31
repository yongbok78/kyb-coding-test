function solution(numbers) {
  var answer = [];
  for (var i = 0; i < numbers.length; i++) {
    for (var j = i + 1; j < numbers.length; j++) {
      var sum = numbers[i] + numbers[j];
      //// 배열에서 두 수를 뽑아 더한 수가 answer에 없으면 추가
      if (answer.indexOf(sum) < 0) answer.push(sum);
    }
  }
  // 오름차순 정렬
  answer.sort((a, b) => a - b);
  return answer;
}

console.log([2, 1, 3, 4, 1]);
console.log([5, 0, 2, 7]);
