function solution(A, B) {
  let arrA = A.toString().split('');
  let arrB = B.toString().split('');
  let count;

  for (let i = 0; i < A.length; i++) {
    if (A !== B) {
      return '1'
    } else {
      count = 0;
    }
  }
  return arrB;
}

console.log(solution(1111, 1101));
console.log(solution(1111, 101));