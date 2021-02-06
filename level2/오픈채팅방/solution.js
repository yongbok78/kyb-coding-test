function solution(record) {
  let users = {};
  return record
    .map((rec) => {
      let r = rec.split(" ");
      if (/Enter|Change/.test(r[0])) users[r[1]] = r[2];
      return r;
    })
    .filter((r) => r[0] !== "Change")
    .map(
      (r) =>
        users[r[1]] +
        (r[0] === "Enter" ? "님이 들어왔습니다." : "님이 나갔습니다.")
    );
}

console.log(
  solution([
    "Enter uid1234 Muzi",
    "Enter uid4567 Prodo",
    "Leave uid1234",
    "Enter uid1234 Prodo",
    "Change uid4567 Ryan",
  ])
);
