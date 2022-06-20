/**
 * <문제> 상하좌우
문제 설명

여행가 A는 N x N 크기의 정사각형 공간위에 있음. 이 공간은 1x1 크기의 정사각형으로 나누어져 있음.
가장 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당함.
여행가 A는 상,하,좌,우 방향으로 이동할 수 있으며, 시작 좌표는 항상(1,1)임.
우리 앞에는 여행가 A가 이동할 계획이 적힌 계획서가 놓여 있음.
계획서에는 하나의 줄에 띄어쓰기를 기준으로 하여 L,R,U,D 중 하나의 문자가 반복적으로 적혀있음.
각 문자의 의미는 다음과 같음

L : 왼쪽으로 한 칸 이동
R : 오른쪽으로 한 칸 이동
U : 위로 한 칸 이동
D : 아래로 한 칸 이동
이때 여행가 A가 N x N 크기의 정사각형 공간을 벗어나는 움직임은 무시됨.
예를 들어 (1,1)의 위치에서 L 혹은 U을 만나면 무시됨.
다음은 N=5인 지도와 계획서임.
 */

// const n = prompt('N : ');
// const plans = [];

// for (let i = 0; i < 100; i++) {
//   const plan = prompt('L,R,U,D 중 하나를 적어주세요. (종료 : e)');
//   if (plan === 'e') break;
//   plans.push(plan);
// }

// const dx = [0, 0, -1, 1]; // 세로 LRUD
// const dy = [-1, 1, 0, 0]; // 가로 LRUD
// const moveTpyes = ['L', 'R', 'U', 'D'];

// let x = 1;
// let y = 1; // 시작 지점
// let nx, ny; // 다음 지점

// for (let i = 0; i < plans.length; i++) {
//   for (let j = 0; j < moveTpyes.length; j++) {
//     if (plans[i] === moveTpyes[j]) {
//       nx = x + dx[j];
//       ny = y + dy[j];
//       if (nx < 1 || ny < 1 | nx > n || ny > n) continue;

//       x = nx;
//       y = ny;
//     }
//   }

//   console.log(`${i + 1}번째 : ${plans[i]}, (x = ${x}, y = ${y} )`);
// }

// console.log(`${nx}, ${ny}`);

/**<문제1>시각
문제 설명

정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시간중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오. 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각임.
00시 00분 03초
00시 13분 30초
반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각임
00시 02분 55초
01시 27분 45초
 */

// const n = prompt('0~23 입력 : ');
// let answer = 0;

// for (let hour = 0; hour <= n; hour++) {
//   for (let min = 0; min < 60; min++) {
//     for (let sec = 0; sec < 60; sec++) {
//       if ((String(hour) + String(min) + String(sec)).includes('3')) {
//         answer++;
//       }
//     }
//   }
// }

// console.log(answer);

/**
<문제2> 왕실의 나이트
문제 설명

행복 왕궁의 왕실 정원은 체스판과 같은 8 x 8 좌표 평면임. 왕실 정원의 특정한 한 칸에 나이트가 서있음. 나이트는 매우 충성스러운 신하로서 매일 무술을 연마함.
나이트는 말을 타고 있기 때문에 이동을 할 때는 L자 형태로만 이동할 수 있으며 정원 밖으로는 나갈 수 없음
나이트는 특정 위치에서 다음과 같은 두 가지 경우로 이동할 수 있음
수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
이처럼 8 x 8 좌표 평면상에서 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램을 작성하시오. 왕실의 정원에서 행 위치를 표현할 때는 1부터 8로 표현하며, 열 위치를 표현할 때는 a부터 h로 표현함.

c2에 있을 때 이동할 수 있는 경우의 수는 6가지임. 
 */

//a1 => (row, col) => (1,1)

function knight(location) {
  let col = location.charCodeAt(0) - 96;
  let row = parseInt(location[1]);
  let nextRow = row;
  let nextCol = col;

  let count = 0;

  const move_types = [[1, -2], [2, -1], [-1, -2], [-2, -1],
  [2, 1], [1, 2], [-2, 1], [-1, 2]];

  for (let i = 0; i < move_types.length; i++) {
    nextRow = row + move_types[i][0];
    nextCol = col + move_types[i][1];
    if (nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8) count++;
  }
  return count;
}

console.log(knight("c2"));