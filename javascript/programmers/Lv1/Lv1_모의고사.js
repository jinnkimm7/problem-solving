function solution(answers) {
  let answer = [];
  const a1 = [1, 2, 3, 4, 5];
  const a2 = [2, 1, 2, 3, 2, 4, 2, 5];
  const a3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  let score = [0, 0, 0];

  for (let i = 0; i < answers.length; i++) {
    if (answers[i] === a1[i]) score[0]++;
    if (answers[i] === a2[i]) score[1]++;
    if (answers[i] === a3[i]) score[2]++;
  }

  const max = Math.max(...score);

  for (let i = 0; i < score.length; i++) {
    if (max === score[i]) answer.push(i + 1);
  }

  return answer;
}

console.log(solution([1, 2, 3, 4, 5]));
console.log(solution([1, 3, 2, 4, 2]));