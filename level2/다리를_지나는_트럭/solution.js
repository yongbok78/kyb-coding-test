function solution(bridge_length, weight, truck_weights) {
  var answer = 0; // 총 경과시간
  var bridge = new Array(bridge_length).fill(0); // 다리 초기화
  var upWeight = 0; // 다리위 트럭 무게의 합
  for (var i = 0; i < truck_weights.length; i++) {
    answer++;
    upWeight -= bridge.shift();
    var w = truck_weights[i];
    // 다리위에 트럭이 올라가면서 제한 무게를 초과 할 때
    if (weight < upWeight + w) {
      bridge.push(0);
      i--;
    } else {
      bridge.push(w);
      upWeight += w;
    }
  }

  // 다리위에 남은 트럭 빼기
  while (upWeight != 0) {
    upWeight -= bridge.shift();
    answer++;
  }
  return answer;
}

console.log(solution(2, 10, [7, 4, 5, 6]));
console.log(solution(100, 100, [10]));
console.log(solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]));
