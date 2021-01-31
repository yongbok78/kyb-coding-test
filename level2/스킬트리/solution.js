function solution(skill, skill_trees) {
  return skill_trees.reduce((cnt, tree) => {
    if (skill.startsWith(tree.replace(new RegExp(`[^${skill}]`, "g"), "")))
      cnt++;
    return cnt;
  }, 0);
}

console.log(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]));
