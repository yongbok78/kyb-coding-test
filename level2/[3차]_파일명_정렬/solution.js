function solution(files) {
  let reg = /^([a-z-A-Z- ]+)(\d+)/;
  return files.sort((a, b) => {
    let arrA = reg.exec(a);
    let arrB = reg.exec(b);
    let [aHead, bHead] = [arrA[1].toLowerCase(), arrB[1].toLowerCase()];
    if (aHead != bHead) return aHead > bHead ? 1 : -1;

    let [aNum, bNum] = [parseInt(arrA[2]), parseInt(arrB[2])];
    return aNum - bNum;
  });
}

console.log(
  solution([
    "img12.png",
    "img10.png",
    "img02.png",
    "img1.png",
    "IMG01.GIF",
    "img2.JPG",
  ])
);
console.log(
  solution([
    "F-5 Freedom Fighter",
    "B-50 Superfortress",
    "A-10 Thunderbolt II",
    "F-14 Tomcat",
  ])
);
