function solution(n) {
  let answer = 0;
  let prime = [];
  for (let i = 2; i <= n; i++) {
    for (let j = 2; j < i; j++) {
      if (i % j !== 0) prime.push(i);
    }
  }
  return prime;
}

console.log(solution(10));
console.log(solution(5));