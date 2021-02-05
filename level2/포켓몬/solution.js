function solution(nums) {
  var answer = nums.length / 2;
  let mon = new Set(nums);
  return answer < mon.size ? answer : mon.size;
}

console.log(solution([3, 1, 2, 3]));
console.log(solution([3, 3, 3, 2, 2, 4]));
console.log(solution([3, 3, 3, 2, 2, 2]));
