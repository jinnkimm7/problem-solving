// function solution(left, right) {
//   let answer = 0;
//   for (let i = left; i <= right; i++) {
//     if (Number.isInteger(Math.sqrt(i))) {
//       answer -= i;
//     } else {
//       answer += i;
//     }
//   }
//   return answer;
// }

// 새로운 풀이
function divisors(num) {
  let count = 0;
  for (let i = 1; i <= num; i++) {
    if (num % i === 0) {
      count++;
    }
  }
  return count;
}

function solution(left, right) {
  let answer = 0;
  for (let i = left; i <= right; i++) {
    let count = divisors(i);
    if (count % 2 === 0) answer += i;
    else answer -= i;
  }
  return answer;
}

console.log(solution(13, 17));
console.log(solution(24, 27));