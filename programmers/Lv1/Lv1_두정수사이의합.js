// function solution(a, b) {
//   let sum = 0;
//   let num = [];
//   // a와 b가 같을 경우
//   if (a === b) return a;
//   // a와 b가 다른 경우
//   else {
//     num.push(a, b);
//     num.sort((a, b) => (a - b));
//     for (let i = num[0]; i < num[1] + 1; i++) {
//       sum += i;
//     }
//     return sum;
//   }
// }

function solution(a, b) {
  a > b && ([a, b] = [b, a]);
  return Array(b - a + 1).fill(a).map((v, i) => v + i).reduce((a, c) => a + c);
}

console.log(solution(3, 5));
console.log(solution(3, 3));
console.log(solution(5, 3));