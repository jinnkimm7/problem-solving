// 1번째 풀이
// function solution(arr) {
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] === arr[i + 1]) {
//       arr.splice(i, 1);
//       i--;
//     }
//   }
//   return arr;
// }

// 2번째 풀이
// function solution(arr) {
//   let answer = [];
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] !== arr[i + 1]) {
//       answer.push(arr[i]);
//     }
//   }
//   return answer;
// }

// filter를 이용한 풀이
function solution(arr) {
  return arr.filter((val, index) => val != arr[index + 1]);
}

console.log(solution([1, 1, 3, 3, 0, 1, 1]));
console.log(solution([4, 4, 4, 3, 3]));