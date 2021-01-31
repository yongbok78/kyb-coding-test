function solution(s) {
  var answer = s
    .split("")
    .sort((a, b) => {
      if (a.toUpperCase() === a && b.toUpperCase() !== b) return 1;
      else if (b.toUpperCase() === b && a.toUpperCase() !== a) return -1;
      return b.localeCompare(a);
    })
    .join("");
  return answer;
}

console.log(solution("Zbcdefg"));
