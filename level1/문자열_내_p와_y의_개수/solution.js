function solution(s) {
  return (
    s.split("").filter((v) => v === "p" || v === "P").length ===
    s.split("").filter((v) => v === "y" || v === "Y").length
  );
}

console.log(solution("pPoooyY"));
console.log(solution("Pyy"));
