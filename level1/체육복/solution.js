function solution(n, lost, reserve) {
  var answer = n;
  var students = new Array(5).fill(0);
  // 체육복 잃어 버린 학생 확인
  for (var i = 0; i < lost.length; i++) {
    students[lost[i] - 1]--;
  }
  // 여벌 확인
  for (var i = 0; i < reserve.length; i++) {
    students[reserve[i] - 1]++;
  }

  for (var i = 0; i < n; i++) {
    // 체육복 잃어버렸으면
    if (students[i] == -1) {
      // 앞번호 학생이 여벌 있으면 빌리고
      if (i - 1 >= 0 && students[i - 1] == 1) {
        students[i]++;
        students[i - 1]--;
        // 뒷번호 학생 여벌 있으면 빌리고
      } else if (i + 1 < students.length && students[i + 1] == 1) {
        students[i]++;
        students[i + 1]--;
        // 자기가 없으면 자기꺼 입고
      } else answer--;
    }
  }
  return answer;
}

console.log(solution(5, [2, 4], [1, 3, 5]));
console.log(solution(5, [2, 4], [3]));
console.log(solution(3, [3], [1]));
