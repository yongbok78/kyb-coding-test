function solution(people, limit) {
  var answer = people.length;
  // 내림차순 정렬
  people.sort((a, b) => b - a);
  // 제일 무건운 사람과 제일 가변운 사람을 태워보고
  // 무게 제한을 넘지 않은면 보트 댓수를 한대씩 빼준다.
  var [s, e] = [0, people.length - 1];
  while (s < e) {
    if (people[s] + people[e] <= limit) {
      answer--;
      e--;
    }
    s++;
  }
  return answer;
}

console.log(solution([70, 50, 80, 50], 100));
console.log(solution([70, 80, 50], 100));
