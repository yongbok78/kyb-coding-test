function solution(numbers, target) {
  var answer = dfs(numbers, 0, 0, target);
  return answer;
}
function dfs(numbers, depth, sum, target) {
  if (depth === numbers.length) {
    if (sum === target) return 1;
    return 0;
  }
  return (
    dfs(numbers, depth + 1, sum + numbers[depth], target) +
    dfs(numbers, depth + 1, sum - numbers[depth], target)
  );
}

console.log(solution([1, 1, 1, 1, 1], 3));
