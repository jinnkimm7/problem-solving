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

const n = prompt('N : ');
const plans = [];

for (let i = 0; i < 100; i++) {
  const plan = prompt('L,R,U,D 중 하나를 적어주세요. (종료 : e)');
  if (plan === 'e') break;
  plans.push(plan);
}

const dx = [0, 0, -1, 1]; // 세로 LRUD
const dy = [-1, 1, 0, 0]; // 가로 LRUD
const moveTpyes = ['L', 'R', 'U', 'D'];

let x = 1;
let y = 1; // 시작 지점
let nx, ny; // 다음 지점

for (let i = 0; i < plans.length; i++) {
  for (let j = 0; j < moveTpyes.length; j++) {
    if (plans[i] === moveTpyes[j]) {
      nx = x + dx[j];
      ny = y + dy[j];
      if (nx < 1 || ny < 1 | nx > n || ny > n) continue;

      x = nx;
      y = ny;
    }
  }

  console.log(`${i + 1}번째 : ${plans[i]}, (x = ${x}, y = ${y} )`);
}

console.log(`${nx}, ${ny}`);