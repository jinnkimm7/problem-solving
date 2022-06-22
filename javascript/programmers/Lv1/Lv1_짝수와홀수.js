//내 풀이
function solution(num) {
  let answer = '';
  if (num % 2 === 0) answer = "Even"
  else answer = "Odd"

  return answer;
}

const num = 0;
console.log(`${num}은 ${solution(num)}이다.`);

// 다른 사람 풀이 : 3항 연산자 이용

function evenOrOdd(num) {
  return num % 2 ? 'Odd' : 'Even';
}

console.log(`결과 : ${evenOrOdd(3)}`);
console.log(`결과 : ${evenOrOdd(0)}`);