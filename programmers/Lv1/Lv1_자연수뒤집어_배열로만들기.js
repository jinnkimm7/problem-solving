//내 풀이
function solution(n) {
  let arr = String(n).split('').reverse();
  for (let i = 0; i < arr.length; i++) {
    arr[i] = parseInt(arr[i]);
  }
  return arr;
}

console.log(solution(12345));

//다른 사람 풀이
function solution(n) {
  return (n + '').split('').reverse().map(n => parseInt(n));
}