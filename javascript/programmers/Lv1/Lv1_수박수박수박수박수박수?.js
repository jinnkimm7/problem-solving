//내 풀이
// function solution(n) {
//   let arr = [];
//   for (let i = 0; i < n; i++) {
//     i % 2 === 0 ? arr.push('수') : arr.push('박');
//   }
//   return arr.join('');
// }

//다른 사람풀이
function solution(n) {
  return "수박".repeat(n).substring(0, n);
}

console.log(solution(3));
console.log(solution(4));