const glob = require("fast-glob");
const fs = require("fs-extra");
glob("level*/**/README.md", { ignore: "**/타겟_넘버/**" }).then((files) => {
  files.sort(
    (a, b) => fs.statSync(a).mtime.getTime() - fs.statSync(b).mtime.getTime()
  );

  let cnt = 1;
  for (let f of files) {
    let path = f.replace("README.md", "");
    let nm = "Solution";
    let pad = ("" + cnt).padStart(3, "0");
    fs.writeFileSync(
      path + nm + pad + ".java",
      fs
        .readFileSync(path + nm + ".java")
        .toString()
        .replace(/(Solution)/g, "$1" + pad)
    );
    fs.removeSync(path + nm + ".java");
    console.log(path + nm + pad + ".java");
    cnt++;
  }
});
