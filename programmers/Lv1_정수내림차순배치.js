// 1. 숫자 입력
// 2. 
function solution(n) {
  return parseInt(String(n).split('').sort().reverse().join(''));
}

console.log(solution(118372));