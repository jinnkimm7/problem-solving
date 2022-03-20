// 내 풀이
function solution(arr) {
  let answer = 0;
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
    answer = sum / arr.length;
  };
  return answer;
}

const arr1 = [1, 2, 3, 4];
console.log(`평균값: ${average(arr1)}`);

// reduce method 적용
function average(arr) {
  return arr.reduce((a, b) => a + b) / arr.length;
}

const arr2 = [1, 2, 3, 4];
console.log(`평균값: ${average(arr2)}`);