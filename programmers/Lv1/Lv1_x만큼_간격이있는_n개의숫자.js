// 내 풀이
function solution(x, n) {
  let answer = [];
  for (let i = 0; i < n; i++) answer.push(x * (i + 1));
  return answer;
}

console.log(solution(2, 5));
console.log(solution(4, 3));
console.log(solution(-4, 2));

// 다른 사람 풀이

function solution(x, n) {
  return Array(n).fill(x).map((current, i) => current * (i + 1));
}

console.log(solution(2, 5));
console.log(solution(4, 3));
console.log(solution(-4, 2));