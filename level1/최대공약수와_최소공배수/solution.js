function solution(n, m) {
  var answer = [0, 0]; // [최대 공약수, 최소 공배수]
  // 최대 공약수 구하기
  for (var i = n; i > 0; i--) {
    if (n % i === 0) {
      for (var j = m; j > 0; j--) {
        if (m % i === 0) {
          answer[0] = i;
          break;
        }
      }
    }
    if (answer[0] > 0) break;
  }

  // 최소 공배수 구하기
  var ni = 1;
  var mi = 1;
  var nMulti = n; // n의 배수
  var mMulti = m; // m의 배수
  while (answer[1] === 0) {
    if (nMulti < mMulti) {
      while (true) {
        ni++;
        nMulti = n * ni;
        if (nMulti >= mMulti) break;
      }
    } else if (nMulti > mMulti) {
      while (true) {
        mi++;
        mMulti = m * mi;
        if (nMulti <= mMulti) break;
      }
    } else {
      answer[1] = nMulti;
    }
  }

  return answer;
}

console.log(solution(3, 12));
console.log(solution(2, 5));
