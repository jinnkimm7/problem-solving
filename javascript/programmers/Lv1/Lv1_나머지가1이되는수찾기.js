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

//또 다른 나의 풀이
function solution(n) {
  return Array(n).fill()
    .map((v, i) => i + 1)
    .filter(v => n % v === 1)[0];
}

console.log(solution(10));
console.log(solution(12));