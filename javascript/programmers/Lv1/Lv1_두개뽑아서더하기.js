function solution(numbers) {
  let answer = [];
  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      let sum = numbers[i] + numbers[j];
      if (answer.indexOf(sum) === -1) answer.push(sum);
      answer.sort((a, b) => a - b);
    }
  }
  return answer;
}

console.log(solution([2, 1, 3, 4, 1]));

//다른 사람 풀이
function solution(numbers) {
  const temp = []

  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      temp.push(numbers[i] + numbers[j])
    }
  }

  const answer = [...new Set(temp)]

  return answer.sort((a, b) => a - b)
}
