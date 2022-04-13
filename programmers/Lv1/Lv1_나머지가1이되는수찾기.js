// function solution(n) {
//   for (let i = 1; i < n; i++) {
//     if (n % i === 1) return i;
//   }
// }

// function solution(n, x = 1) {
//   while (x++) {
//     if (n % x === 1) return x;
//   }
// }

function solution(n) {
  let answer = 1;
  while (n % answer !== 1) answer++;
  return answer;
}

console.log(solution(10));
console.log(solution(12));