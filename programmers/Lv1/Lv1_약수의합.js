function solution(n) {
  let arr = [];
  for (let i = 1; i <= n; i++) {
    if (n % i === 0) arr.push(i);
  }
  let sum = arr.reduce((acc, cur) => acc + cur);
  return sum;
}

console.log(solution(12));
console.log(solution(5));