# [level 0] 홀수 vs 짝수 - 181887 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181887) 

### 성능 요약

메모리: 88.9 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 28일 12:19:55

### 문제 설명

<p style="user-select: auto !important;">정수 리스트 <code style="user-select: auto !important;">num_list</code>가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">5 ≤ <code style="user-select: auto !important;">num_list</code>의 길이 ≤ 50</li>
<li style="user-select: auto !important;">-9 ≤ <code style="user-select: auto !important;">num_list</code>의 원소 ≤ 9</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">num_list</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[4, 2, 6, 1, 7, 6]</td>
<td style="user-select: auto !important;">17</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[-1, 2, 5, 6, 3]</td>
<td style="user-select: auto !important;">8</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<p style="user-select: auto !important;">※2023년 04월 24일 테스트 케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges