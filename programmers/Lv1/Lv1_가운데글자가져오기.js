function solution(s) {
  const midIdx = Math.floor(s.length / 2);
  return s.length % 2 !== 0 ? s[midIdx] : s[midIdx - 1] + s[midIdx]
}

console.log(solution('abcde'));
console.log(solution('qwer'));