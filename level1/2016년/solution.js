function solution(a, b) {
  var d = new Date(`2016-${a}-${b}`);
  return d.toString().slice(0, 3).toUpperCase();
}
