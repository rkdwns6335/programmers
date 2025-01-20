# [level 0] 홀짝에 따라 다른 값 반환하기 - 181935 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181935) 

### 성능 요약

메모리: 73.3 MB, 시간: 3.63 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 20일 16:32:54

### 문제 설명

<p style="user-select: auto !important;">양의 정수 <code style="user-select: auto !important;">n</code>이 매개변수로 주어질 때, <code style="user-select: auto !important;">n</code>이 홀수라면 <code style="user-select: auto !important;">n</code> 이하의 홀수인 모든 양의 정수의 합을 return 하고 <code style="user-select: auto !important;">n</code>이 짝수라면 <code style="user-select: auto !important;">n</code> 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ 100</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">16</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">220</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">n</code>은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">n</code>은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 2<sup style="user-select: auto !important;">2</sup> + 4<sup style="user-select: auto !important;">2</sup> + 6<sup style="user-select: auto !important;">2</sup> + 8<sup style="user-select: auto !important;">2</sup> + 10<sup style="user-select: auto !important;">2</sup> = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges