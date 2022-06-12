function solution(num) {
  let result = 0;

  //500번 반복
  for (let i = 0; i < 500; i++) {
    // 1이 아닌 경우 계산 계속 반복
    if (num !== 1) {
      if (num % 2 === 0) {
        num /= 2;
      } else {
        num = num * 3 + 1;
      }
    }
    // 1인경우 현재 횟수 출력
    else {
      return result = i;
    }
  }
  return result = -1; //500번 실행했지만 result가 없는 경우
}

console.log(solution(6));
console.log(solution(16));
console.log(solution(626331));


// 다른 사람 풀이 : while문 이용.
function solution(n) {
  let answer = 0;
  let count = 0;
  while (n > 1 && count <= 500) {
    count++; // 한번 while문을 돌 때마다 count 1씩 +
    if (n % 2 === 0) { //짝수면
      n = n / 2
    } else { //홀수면
      n = n * 3 + 1;
    }

    //n이 1이면 끝
    if (n === 1) break;
  }
  if (count > 500) return -1;
  else return count;
}

function solution(num) {
  let count = 0;
  while (num !== 1 && count !== 500) {
    num % 2 === 0 ? num = num /= 2 : num = (num * 3) + 1;
    count++
  }

  return num === 1 ? count : -1;
}

console.log(solution(6));
console.log(solution(16));
console.log(solution(626331));