//내 풀이
function solution(x) {
  let sum = 0;
  let arr = String(x).split('');
  for (let i = 0; i < arr.length; i++) {
    sum += parseInt(arr[i]);
  }
  return (x % sum === 0) ? true : false;
}

console.log(solution(10));
console.log(solution(12));
console.log(solution(11));
console.log(solution(13));