// function solution(n) {
//   let arr = [];
//   for (let i = 1; i <= n; i++) {
//     if (n % i === 0) arr.push(i);
//   }
//   let sum = arr.reduce((acc, cur) => acc + cur);
//   return sum;
// }

function solution(n) {
  return Array(n).fill().map((v, i) => i + 1)
    .reduce((a, c) => n % c ? a : a + c, 0);
}


console.log(solution(12));
console.log(solution(5));