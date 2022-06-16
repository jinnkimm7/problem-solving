// 자연수가 들어있는 배열 arr가 매개변수로 주어집니다. 
// 배열 arr안의 숫자들 중에서 앞에 있는 숫자들부터 뒤에 중복되어 나타나는 숫자들 중복 횟수를 계산해서 배열로 return 하도록 solution 함수를 완성해주세요.
// 만약 중복되는 숫자가 없다면 배열에 -1을 채워서 return 하세요.

// ▶입출력 예 #1
// arr = [1, 2, 3, 3, 3, 3, 4, 4]에서 3은 4번, 4는 2번씩 나타나므로 [4, 2]를 반환합니다.

// ▶입출력 예 #2
// arr = [3, 2, 4, 4, 2, 5, 2, 5, 5]이면 2가 3회, 4가 2회, 5가 3회 나타나므로 [3, 2, 3]를 반환합니다.

// ▶입출력 예 #3
// [3, 5, 7, 9, 1]에서 중복해서 나타나는 숫자는 없으므로 [-1]을 반환합니다.

// ##### 제한사항

// - 배열 arr의 길이는 1 이상 100 이하의 자연수입니다.
// - 배열 arr의 원소는 1 이상 100 이하의 자연수입니다.

// 본 프로그래밍 문항의 해설은 6월 14일(목)에 본 edwith 자가진단 페이지를 통해 공개 됩니다. 
// 해설을 보기 전에 스스로 처음부터 문제를 해결할수 있는지 점검해보세요. 

// function solution(arr) {
//   const obj1 = arr.sort().reduce((pv, cv) => {
//     pv[cv] = (pv[cv] || 0) + 1;
//     return pv;
//   }, {});
//   const arr1 = Object.values(obj1).filter(v => v !== 1)

//   return arr1.length === 0 ? [-1] : arr1;
// }

/**
 * 풀이 1
<가> 배열에서 특정한 숫자의 중복 횟수를 계산하는 countOf() 라는 하위 함수를 선언합니다.
<나> 이미 중복을 계산한 숫자는 제외하기 위해서 Set 에 넣어주고 포함 여부를 확인합니다.
<다> 주어진 조건에 맞춰서 중복 횟수가 1을 초과하는 경우만 출력할 배열에 추가합니다.
<라> 마지막 부분에서는 빈 배열인 경우에 -1을 추가합니다.
 */

// function countOf(arr, value) { // <가>
//   let count = 0;
//   arr.forEach(element => {
//     if (element === value) count++;
//   })
//   return count;
// }

// function solution(arr) {
//   const answer = [];
//   const set = new Set([]);
//   arr.forEach(element => {
//     if (set.has(element)) return; // <나>
//     set.add(element);
//     count = countOf(arr, element);
//     if (count > 1) answer.push(count); // <다>
//   });
//   if (answer.length == 0) answer.push(-1); // <라>
//   return answer;
// }

/**풀이 2
<가> Map은 값만 순서대로 보관하는 배열과 다르게 특정한 키에 대한 값을 보관하는 방식입니다.
이전에 키값을 지정한 적이 있는지 확인해서 있으면 중복 횟수를 +1 해서 다시 저장합니다.
<나> 만약 한 번도 나오지 않아서 Map에 없는 키라면, 중복 횟수를 1로 저장합니다.
<다> 이렇게 만들어진 Map에서 value값을 확인해서 1을 초과하는 경우만 결과 배열에 추가합니다.
<라> 마지막 부분에서는 빈 배열인 경우에 -1을 추가합니다.
 */

function solution(arr) {
  const answer = [];
  const map = new Map();
  arr.forEach(element => {
    if (map.has(element)) { // <가>
      map.set(element, map.get(element) + 1);
    } else { // <나>
      map.set(element, 1);
    }
  });
  map.forEach(value => {
    if (value > 1) { // <다>
      answer.push(value);
    }
  });
  if (answer.length === 0) answer.push(-1); //<라>

  return answer;
}

console.log(solution([1, 2, 3, 3, 3, 3, 4, 4]));
console.log(solution([3, 2, 4, 4, 2, 5, 2, 5, 5]));
console.log(solution([3, 5, 7, 9, 1]));