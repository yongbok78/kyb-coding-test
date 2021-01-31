function solution(m, musicinfos) {
  // 조건이 일치하는 음악이 없을 때에는 "(None)"을 반환
  var answer = "(None)";
  // 각 코드 뒤에 "|" 삽입
  m = m.match(/[A-G]#?/g).join("|") + "|";

  musicinfos = musicinfos
    .map((v) => {
      const a = v.split(",");
      // 시간 간격 계산
      const playMinutes =
        (new Date("2021-2-1 " + a[1]) - new Date("2021-2-1 " + a[0])) / 60000;
      const title = a[2];
      const codes = a[3].match(/[A-G]#?/g);
      while (codes.length !== playMinutes) {
        if (codes.length < playMinutes) codes.push(...codes);
        else if (codes.length > playMinutes) codes.splice(playMinutes);
      }
      // [시간 간격, 제목, 코드 뒤에 "|" 삽입]
      return [playMinutes, title, codes.join("|") + "|"];
    })
    // 코드에 m이 포함된 것만 남김
    .filter((a) => a[2].indexOf(m) > -1);

  // 재생된 시간이 제일 긴 음악 제목을 반환
  if (musicinfos.length === 1) answer = musicinfos[0][1];
  else if (musicinfos.length > 1) {
    answer = musicinfos.reduce((max, a) => (max[0] >= a[0] ? max : a))[1];
  }
  return answer;
}
console.log("test");
