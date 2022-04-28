// function solution(n) {
//   return parseInt(n.toString(3).split('').reverse().join(''), 3);
// }

//다른 풀이

function solution(n) {
  return parseInt([...n.toString(3)].reverse().join(''), 3);
}

console.log(solution(45));
console.log(solution(125));