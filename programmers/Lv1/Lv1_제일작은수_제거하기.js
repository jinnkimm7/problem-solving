// function solution(arr) {
//   let min;
//   if (arr.length > 1) {
//     for (let i = 0; i < arr.length; i++) {
//       if (arr[i] > arr[i + 1]) min = arr[i + 1];
//       else min = arr[i];
//     }
//     let idx = arr.indexOf(min);

//     arr.splice(idx, 1);
//     return arr;
//   }
//   else return [-1];
// }

// console.log(solution([4, 3, 2, 1]));
// console.log(solution([10]));


// 다른 사람 풀이
// const solution = (arr) => {
//   arr.splice(arr.indexOf(Math.min(...arr)), 1);
//   return arr.length ? arr : [-1];
// };

function solution(arr) {
  const min = Math.min(...arr);
  const r = arr.filter(v => v !== min);
  return r.length ? r : [-1];
}

console.log(solution([4, 3, 2, 1]));
console.log(solution([10]));


