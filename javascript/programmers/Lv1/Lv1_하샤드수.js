//내 풀이
function solution(x) {
  let sum = 0;
  let arr = String(x).split('');
  for (let i = 0; i < arr.length; i++) {
    sum += parseInt(arr[i]);
  }
  return (x % sum === 0) ? true : false;
}

// 두 번째 내 풀이
function solution(x) {
  const sum = x.toString()
    .split('')
    .map(e => parseInt(e))
    .reduce((a, b) => a + b);

  return x % sum === 0 ? true : false;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.

console.log(solution(10));
console.log(solution(12));
console.log(solution(11));
console.log(solution(13));