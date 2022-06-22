function solution(n, m) {
  return Array(m).fill().map(v => '*'.repeat(n)).join('\n')
}

console.log(solution(5, 3));