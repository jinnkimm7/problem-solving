// function solution(absolutes, signs) {
//   let abArr = [];
//   for (let i = 0; i < absolutes.length; i++) {
//     if (signs[i] === false) {
//       abArr.push(-1 * absolutes[i]);
//     } else {
//       abArr.push(absolutes[i]);
//     }
//   }
//   return abArr.reduce((acc, cur) => acc + cur);
// }

function solution(absolutes, signs) {
  return absolutes.reduce((acc, cur, i) => acc + (cur * (signs[i] ? 1 : -1)), 0)
}


console.log(solution([4, 7, 12], [true, false, true]));
console.log(solution([1, 2, 3], [false, false, true]));