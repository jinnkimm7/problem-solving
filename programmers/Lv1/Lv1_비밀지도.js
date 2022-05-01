function solution(n, arr1, arr2) {
  var answer = [];
  let bin1 = [];
  let bin2 = [];
  for (let i = 0; i < n; i++) {
    bin1.push(arr1[i].toString(2).padStart(n, 0));
    bin2.push(arr2[i].toString(2).padStart(n, 0));
  }
  for (let i = 0; i < n; i++) {
    let index = ''
    for (let j = 0; j < n; j++) {
      if (bin1[i][j] === '1' || bin2[i][j] === '1') index += '#';
      else index += ' ';
    }
    answer.push(index);
  }
  return answer;
}


console.log(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]));