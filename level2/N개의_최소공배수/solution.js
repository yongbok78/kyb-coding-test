function solution(arr) {
  // 오름차순 정렬하고
  arr.sort((a, b) => a - b);
  // 제일 큰수
  let max = arr.pop();
  // max가 나누어 떨어지지 않는 수만 남기고
  arr = arr.filter((v) => max % v > 0);
  var answer = max;
  // max의 배수중에 arr에 남은 수 모두로 나누어 떨어질 때까지 반복
  loop: while (true) {
    for (let n of arr) {
      if (answer % n > 0) {
        answer += max;
        continue loop;
      }
    }
    break;
  }
  return answer;
}

console.log(solution([2, 6, 8, 14]));
console.log(solution([1, 2, 3]));
