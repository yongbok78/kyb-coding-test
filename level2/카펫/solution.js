function solution(brown, yellow) {
  var sum = brown + yellow;
  //갈색, 노랑색 합해서 제곱근이 정수이면 정사각형
  var sqrt = Math.sqrt(sum);
  if (Number.isInteger(sqrt)) return [sqrt, sqrt];
  var x = 0;
  var y = 0;
  for (var i = parseInt(sqrt); i >= 1; i--) {
    //제곱근 근사치 정수부터 줄여나가면서 나누어 떨어질때
    if (sum % i === 0) {
      x = sum / i;
      y = i;
      //노랑색 갯수와 같으면 가로, 세로가 구해짐
      if (yellow === (x - 2) * (y - 2)) break;
    }
  }
  var answer = [x, y];
  return answer;
}

console.log(solution(10, 2));
console.log(solution(8, 1));
console.log(solution(24, 24));
