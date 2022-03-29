function solution(n) {
  const arr = String(n).split('').map(x => parseInt(x));
  return arr.reduce((acc, cur) => acc + cur);
}

console.log(solution(123));
console.log(solution(486));