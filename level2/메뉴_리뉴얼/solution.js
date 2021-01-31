function solution(orders, course) {
  var answer = [];
  let courseCnt = {};
  for (let c of course) {
    for (let o of orders) {
      combinations(
        o.split("").sort((a, b) => (a > b ? 1 : -1)),
        c
      )
        .map((v) => v.join(""))
        .every((v) => (courseCnt[v] = (courseCnt[v] | 0) + 1));
    }
  }
  courseCnt = Object.entries(courseCnt);
  for (let c of course) {
    let filterCourse = courseCnt.filter((e) => e[0].length === c);
    let maxCnt = Math.max(...filterCourse.map((e) => e[1]));
    if (maxCnt === 1) continue;
    answer.push(
      ...filterCourse.filter((e) => e[1] === maxCnt).map((e) => e[0])
    );
  }
  return answer.sort((a, b) => (a > b ? 1 : -1));
}

function combinations(arr, selectedCnt) {
  const results = [];
  if (selectedCnt === 1) return arr.map((v) => [v]);
  arr.forEach((v, i, a) => {
    const rest = a.slice(i + 1);
    const combi = combinations(rest, selectedCnt - 1);
    const attached = combi.map((c) => [v, ...c]);
    results.push(...attached);
  });
  return results;
}

console.log(
  solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"], [2, 3, 4])
);
console.log(
  solution(["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"], [2, 3, 5])
);
console.log(solution(["XYZ", "XWY", "WXA"], [2, 3, 4]));
